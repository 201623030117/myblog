package com.service;

import com.pojo.Category;

import java.util.List;

/**
 * @author haydensu
 */
public interface CategoryService {

    /**
     * 通过categoryId获取category对象
     * @param categoryId
     * @return
     */
    Category getCategoryByCategoryId(int categoryId);

    /**
     * 得到所有category对象
     * @return
     */
    List<Category> getAllCategories();
}
