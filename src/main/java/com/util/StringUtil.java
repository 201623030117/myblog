package com.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtil {
    //将逗号分隔的字符串装换为list
    public static List<String> asListByComma(String strings){
        List<String> list = new ArrayList<>();
        if (strings != null && strings.length()> 0){
            list = Arrays.asList(strings.split(","));
        }
        return  list;
    }
}
