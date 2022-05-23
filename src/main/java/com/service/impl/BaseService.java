package com.service.impl;

import com.mapper.*;
import com.service.CategoryService;
import com.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService {

    @Autowired
    protected BlogSettingMapper blogSettingMapper;

    @Autowired
    protected UserTraceLogMapper userTraceLogMapper;

    @Autowired
    protected UserMapper userMapper;

    @Autowired
    protected ArticleMapper articleMapper;

    @Autowired
    protected CommentMapper commentMapper;

    @Autowired
    protected CategoryMapper categoryMapper;

    @Autowired
    protected TagMapper tagMapper;
}
