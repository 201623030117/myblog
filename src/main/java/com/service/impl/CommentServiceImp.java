package com.service.impl;

import com.service.CommentService;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImp extends BaseService implements CommentService {
    @Override
    public int getNumOfCommentByArticle(int articleId) {
       return commentMapper.countNumOfCommentByArticle(articleId);
    }
}
