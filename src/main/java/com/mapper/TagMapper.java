package com.mapper;

import com.pojo.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TagMapper {
    Tag selectByTagId(int tagId);
    List<Tag> selectByArticleId(int articleId);
}
