package com.service;

import com.pojo.UserTraceLog;

/**
 * @author haydensu
 */
public interface UserTraceLogService {

    /**
     * 记录用户访问日志
     * @param userTraceLog
     * @return
     */
    int insertLog(UserTraceLog userTraceLog);
}
