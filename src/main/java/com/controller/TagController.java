package com.controller;

import com.pojo.Article;
import com.pojo.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author haydensu
 */
@Controller
public class TagController extends BaseController {
    @RequestMapping("/tag/{tagId}")
    public String toTag(HttpServletRequest request,
                        @PathVariable(value = "tagId")int tagId){
        ArrayList<Article> articles;
        //如果tagId为0，获得热门文章,否则获得对应tag的文章
        if(tagId == 0){
            int pageSize = Integer.parseInt((String)((Map)request.getServletContext().getAttribute("blogSettingMap")).get("pageSize"));
            articles = (ArrayList)articleService.getHotArticles(pageSize);
            request.setAttribute("hotStatus",1);
        }else {
            articles = (ArrayList)articleService.getArticlesByTagId(tagId);
            request.setAttribute("hotStatus",0);
        }
        //获得所有tag对象
        ArrayList<Tag> tags = (ArrayList) tagService.getAllTags();
        //向请求域传数据
        request.setAttribute("tags",tags);
        request.setAttribute("tagId",tagId);
        request.setAttribute("articles",articles);
        return "tag";
    }
}
