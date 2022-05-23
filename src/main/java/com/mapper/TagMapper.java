package com.mapper;

import com.pojo.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author haydensu
 */
@Repository
public interface TagMapper {
    /**
     * 根据tagId查询tag对象
     * @param tagId
     * @return
     */
    Tag selectByTagId(int tagId);

    /**
     * 根据articleId查询tag，基于tag_article关系表
     * @param articleId
     * @return
     */
    List<Tag> selectByArticleId(int articleId);
}
