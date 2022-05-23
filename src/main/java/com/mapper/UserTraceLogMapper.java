package com.mapper;

import com.pojo.UserTraceLog;
import org.springframework.stereotype.Repository;

/**
 * @author haydensu
 */
@Repository
public interface UserTraceLogMapper {

    /**
     * 插入用户痕迹log
     * @param userTraceLog
     * @return
     */
    int insertLog(UserTraceLog userTraceLog);
}
