package com.bt.server.model.dao;

import com.bt.server.model.pojo.Banner;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BannerMapper extends MyMapper<Banner> {
    List<Banner> selectList();
}