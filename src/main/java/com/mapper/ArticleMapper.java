package com.mapper;

import com.pojo.Article;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author haydensu
 */
@Repository
public interface ArticleMapper {
    /**
     * 统计文章的总数
     * @return
     */
    int countNumOfArticle();

    /**
     * 得到所有的文章
     * @return 返回文章对象组成的list对象
     */
    List<Article> selectAllArticles();

    /**
     * 得到所有推荐文章
     * @return 返回文章对象组成的list对象
     */
    List<Article> selectCommendArticles();

    /**
     * 查找对应categoryId的article对象
     * @param categoryId 分类id
     * @return
     */
    List<Article> selectArticlesByCategoryId(@Param("categoryId") int categoryId);

    /**
     * 查询浏览量最多的前limit条数据
     * @param limit 查询的数据行限制
     * @return
     */
    List<Article> selectArticlesByMostViews(@Param("limit") int limit);
}
