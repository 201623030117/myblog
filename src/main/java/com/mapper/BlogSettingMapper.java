package com.mapper;

import com.pojo.BlogSetting;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogSettingMapper {
    List<BlogSetting> selectAllSetting();
}
