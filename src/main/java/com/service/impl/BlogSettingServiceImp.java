package com.service.impl;

import com.pojo.BlogSetting;
import com.service.BlogSettingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogSettingServiceImp extends BaseService implements BlogSettingService {
    @Override
    public List<BlogSetting> getAllBlogSettings() {
        return blogSettingMapper.selectAllSetting();
    }
}
