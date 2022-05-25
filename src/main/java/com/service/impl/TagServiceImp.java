package com.service.impl;

import com.pojo.Tag;
import com.service.TagService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImp extends BaseService implements TagService {
    @Override
    public Tag getTagById(int tagId) {
        return tagMapper.selectByTagId(tagId);
    }

    @Override
    public List<Tag> getAllTags() {
        return tagMapper.selectAllTags();
    }
}
