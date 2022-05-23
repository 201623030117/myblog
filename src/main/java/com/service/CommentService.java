package com.service;

/**
 * @author haydensu
 */
public interface CommentService {

    /**
     * 得到文章总数
     * @param articleId
     * @return
     */
    int getNumOfCommentByArticle(int articleId);
}
