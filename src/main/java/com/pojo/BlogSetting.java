package com.pojo;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author haydensu
 */
@Component
public class BlogSetting implements Serializable {
    private static final long serialVersionUID = 1L;

    private String settingName;

    private String settingValue;

    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    public String getSettingValue() {
        return settingValue;
    }

    public void setSettingValue(String settingValue) {
        this.settingValue = settingValue;
    }
}
