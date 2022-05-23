package com.service.impl;

import com.pojo.Tag;
import com.service.TagService;
import org.springframework.stereotype.Service;

@Service
public class TagServiceImp extends BaseService implements TagService {
    @Override
    public Tag getTagById(int tagId) {
        return tagMapper.selectByTagId(tagId);
    }
}
