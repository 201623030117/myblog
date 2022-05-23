package com.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
public class Tag implements Serializable {
    private static final long serialVersionUID = 1L;

    private int tagId;

    private String tagName;

    private int usedCount;

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public int getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(int usedCount) {
        this.usedCount = usedCount;
    }
}
