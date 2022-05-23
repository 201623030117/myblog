package com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.Article;
import com.pojo.Tag;
import com.pojo.UserTraceLog;
import com.service.UserTraceLogService;
import com.util.LogUtil;
import com.util.StringUtil;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;


/**
 *未归类的服务控制层
 * @author haydensu
 */
@Controller
public class OtherController extends BaseController {

    @RequestMapping("/index/{pageNum}")
    public String toIndex(@PathVariable(value = "pageNum")int pageNum,
                             HttpServletRequest request){

        //记录访问者信息
        userTraceLogService.insertLog(LogUtil.convertRequest(request,"/index"));
        //获取文章数量
        int numOfArticles = articleService.getNumOfArticles();
        //获取每页的内容数量
        int pageSize = Integer.parseInt((String)((Map)request.getServletContext().getAttribute("blogSettingMap")).get("pageSize"));
        PageHelper.startPage(pageNum,pageSize);
        //获取所有文章
        ArrayList<Article> articles = (ArrayList<Article>) articleService.getAllArticles();
        //获取分页数据
        PageInfo<Article> pageInfo = new PageInfo<>(articles,3);
        //向请求域中传数据
        request.setAttribute("articles",articles);
        request.setAttribute("totalPages",pageInfo.getPages());
        request.setAttribute("pageNum",pageNum);
        request.setAttribute("numOfArticles",numOfArticles);
        return "index";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
