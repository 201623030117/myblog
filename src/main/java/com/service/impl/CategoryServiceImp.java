package com.service.impl;

import com.pojo.Category;
import com.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImp extends BaseService implements CategoryService {
    @Override
    public Category getCategoryByCategoryId(int categoryId) {
        return categoryMapper.selectByCategoryId(categoryId);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryMapper.selectAllCategories();
    }
}
