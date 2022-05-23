package com.listener;

import com.mapper.BlogSettingMapper;
import com.pojo.Article;
import com.pojo.BlogSetting;
import com.service.ArticleService;
import com.service.BlogSettingService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author haydensu
 */
@Component
public class InitListener implements ServletContextListener, ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public ArrayList<BlogSetting> blogSettingList;

    public ArrayList<Article> commendArticleList;

    /**
     * 在项目处理第一次转发请求前的初始化，加载基本数据
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //TemplateEngine templateEngine = (SpringTemplateEngine)applicationContext.getBean("springTemplateEngine");
        //templateEngine.addDialect(new Java8TimeDialect());
        BlogSettingService blogSettingService = applicationContext.getBean(BlogSettingService.class);
        ArticleService articleService = applicationContext.getBean(ArticleService.class);
        blogSettingList = (ArrayList)blogSettingService.getAllBlogSettings();
        commendArticleList = (ArrayList)articleService.getCommendArticles();
        Map<String,String> settingMap = new HashMap<>(20);
        for (BlogSetting setting: blogSettingList){
            settingMap.put(setting.getSettingName(),setting.getSettingValue());
        }
        sce.getServletContext().setAttribute("blogSettingMap",settingMap);
        sce.getServletContext().setAttribute("commendArticleList",commendArticleList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        InitListener.applicationContext = applicationContext;
    }
}
