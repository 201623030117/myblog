package com.mapper;


import com.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author haydensu
 */
@Repository
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    List<User> selectAllUser();
}
