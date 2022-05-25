package com.controller;

import com.pojo.Article;
import com.pojo.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

/**
 * 分类相关的控制层
 * @author haydensu
 */

@Controller
public class CategoryController extends BaseController {

    @RequestMapping("/category/{categoryId}")
    public String toCategory(@PathVariable(value = "categoryId")int categoryId,
                             HttpServletRequest request){
        //得到所有category实体
        ArrayList<Category> categories = (ArrayList)categoryService.getAllCategories();
        //得到当前categoryId的所有article实体
        ArrayList<Article> articles = (ArrayList)articleService.getArticlesByCategoryId(categoryId);

        request.setAttribute("categoryId",String.valueOf(categoryId));
        request.setAttribute("categories",categories);
        request.setAttribute("articles",articles);
        return "category";
    }


}
