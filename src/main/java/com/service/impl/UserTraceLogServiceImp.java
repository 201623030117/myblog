package com.service.impl;

import com.pojo.UserTraceLog;
import com.service.UserTraceLogService;
import org.springframework.stereotype.Service;

@Service
public class UserTraceLogServiceImp extends BaseService implements UserTraceLogService {
    @Override
    public int insertLog(UserTraceLog userTraceLog) {
       return userTraceLogMapper.insertLog(userTraceLog);
    }
}
