package com.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author haydensu
 */
@Component
public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    private int categoryId;

    /**
     * category中文名
     */
    private String categoryCN;

    /**
     * category英文名
     */
    private String categoryEN;

    private int usedCount;

    public int getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(int usedCount) {
        this.usedCount = usedCount;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryCN() {
        return categoryCN;
    }

    public void setCategoryCN(String categoryCN) {
        this.categoryCN = categoryCN;
    }

    public String getCategoryEN() {
        return categoryEN;
    }

    public void setCategoryEN(String categoryEN) {
        this.categoryEN = categoryEN;
    }
}
