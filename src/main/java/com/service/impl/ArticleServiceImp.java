package com.service.impl;

import com.pojo.Article;
import com.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImp extends BaseService implements ArticleService {
    @Override
    public int getNumOfArticles() {
        return articleMapper.countNumOfArticle();
    }

    @Override
    public List<Article> getAllArticles() {
        return articleMapper.selectAllArticles();
    }

    @Override
    public List<Article> getCommendArticles() {
        return articleMapper.selectCommendArticles();
    }

    @Override
    public List<Article> getArticlesByCategoryId(int categoryId) {
        return articleMapper.selectArticlesByCategoryId(categoryId);
    }
}
