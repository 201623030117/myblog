package com.util;

import com.pojo.UserTraceLog;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.OperatingSystem;
import eu.bitwalker.useragentutils.UserAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * @author haydensu
 */
@Component
public class LogUtil {

    private static UserTraceLog userTraceLog;

    @Autowired
    public  void setUserTraceLog(UserTraceLog userTraceLog) {
        LogUtil.userTraceLog = userTraceLog;
    }

    /**
     * 将request对象和apiPath字符串转换为userTraceLog对象
     * @param request 请求报文对象
     * @param apiPath 访问路径
     * @return
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public static UserTraceLog convertRequest(HttpServletRequest request,String apiPath){
        UserAgent userAgent = UserAgent.parseUserAgentString(request.getHeader("User-Agent"));
        Browser browser = userAgent.getBrowser();
        OperatingSystem os = userAgent.getOperatingSystem();
        userTraceLog.setUserAgent(request.getHeader("User-Agent"));
        userTraceLog.setBrowserName(browser.getName());
        userTraceLog.setOsName(os.getName());
        userTraceLog.setIp(getIp(request));
        userTraceLog.setAccessTime(LocalDateTime.now());
        userTraceLog.setReferer(request.getHeader("Referer"));
        userTraceLog.setApiPath(apiPath);
        return userTraceLog;
    }


    /**
     * 从request对象中获取ip
     * @param request
     * @return
     */
    public static String getIp(HttpServletRequest request){
        String ip = request.getHeader("X-Real-IP");
        if(ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)){
            return ip;
        }
        ip = request.getHeader("X-Forwarded-for");
        //多次反向代理后会有多个ip，第一个为真实ip
        if(ip != null && ip.length() != 0 && !"unknown".equalsIgnoreCase(ip)){
            int index = ip.indexOf(',');
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        }else {
        return request.getRemoteAddr();}
    }

}
