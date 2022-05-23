package com.mapper;

import com.pojo.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author haydensu
 */
@Repository
public interface CategoryMapper {
    /**
     * 通过分类id查询category对象
     * @param categoryId 分类id
     * @return 一个category对象
     */
    Category selectByCategoryId(int categoryId);

    /**
     * 查询所有category对象
     * @return category对象组成的list
     */
    List<Category> selectAllCategories();
}
