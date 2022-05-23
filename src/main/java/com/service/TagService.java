package com.service;

import com.pojo.Tag;

/**
 * @author haydensu
 */
public interface TagService {

    /**
     * 通过tagId获取tag
     * @param tagId
     * @return
     */
    Tag getTagById(int tagId);
}
