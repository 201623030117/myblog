package com.service;

import com.pojo.Tag;

import java.util.List;

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

    /**
     * 得到所有tag对象
     * @return
     */
    List<Tag> getAllTags();
}
