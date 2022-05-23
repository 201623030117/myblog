package com.mapper;

import com.pojo.UserTraceLog;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTraceLogMapper {

    int insertLog(UserTraceLog userTraceLog);
}
