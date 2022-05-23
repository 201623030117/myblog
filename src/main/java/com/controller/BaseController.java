package com.controller;

import com.mapper.CommentMapper;
import com.service.*;
import com.service.impl.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class BaseController {

    @Autowired
    protected BlogSettingService blogSettingService;

    @Autowired
    protected UserService userService;

    @Autowired
    protected UserTraceLogService userTraceLogService;

    @Autowired
    protected ArticleService articleService;

    @Autowired
    protected CommentService commentService;

    @Autowired
    protected  CategoryService categoryService;

    @Autowired
    protected TagService tagService;
}
