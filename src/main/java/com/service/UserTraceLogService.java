package com.service;

import com.pojo.UserTraceLog;

public interface UserTraceLogService {

    //记录用户访问日志
    int insertLog(UserTraceLog userTraceLog);
}
