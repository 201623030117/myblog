package com.mapper;

import org.springframework.stereotype.Repository;

/**
 * @author haydensu
 */
@Repository
public interface CommentMapper {
    /**
     * 通过文章id得到评论数
     * @param articleId
     * @return
     */
    int countNumOfCommentByArticle(int articleId);
}
