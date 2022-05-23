package com.mapper;

import com.pojo.BlogSetting;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author haydensu
 */
@Repository
public interface BlogSettingMapper {
    /**
     * 查询所有博客设置
     * @return
     */
    List<BlogSetting> selectAllSetting();
}
