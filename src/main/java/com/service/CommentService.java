package com.service;

public interface CommentService {
    //通过文章id获取评论数
    int getNumOfCommentByArticle(int articleId);
}
