package com.bt.server.model.dao;

import com.bt.server.model.dao.MyMapper;
import com.bt.server.model.pojo.Order;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper extends MyMapper<Order> {
}