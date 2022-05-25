package com.service;

import com.pojo.Article;

import java.util.List;

/**
 * @author haydensu
 */
public interface ArticleService {
    /**
     * 获取文章数量
     * @return
     */
    int getNumOfArticles();

    /**
     * 获取所有文章
     * @return
     */
    List<Article> getAllArticles();

    /**
     * 得到所有推荐文章
     * @return
     */
    List<Article> getCommendArticles();

    /**
     * 通过categoryId查询符合条件的文章
     * @param categoryId
     * @return
     */
    List<Article> getArticlesByCategoryId(int categoryId);

    /**
     * 得到limit条数量的热门文章
     * @param limit
     * @return
     */
    List<Article> getHotArticles(int limit);

    /**
     * 根据tagId得到对应的article
     * @param tagId
     * @return
     */
    List<Article> getArticlesByTagId(int tagId);
}
