package com.bt.server.model.dao;

import com.bt.server.model.dao.MyMapper;
import com.bt.server.model.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends MyMapper<User> {
}