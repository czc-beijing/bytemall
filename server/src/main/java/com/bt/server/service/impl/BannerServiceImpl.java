package com.bt.server.service.impl;

import com.bt.server.model.dao.BannerMapper;
import com.bt.server.model.pojo.Banner;
import com.bt.server.model.vo.BannerVO;
import com.bt.server.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.BeanUtils;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<BannerVO> bannerList() {
        List<BannerVO> bannerVOList = new ArrayList<>();
        List<Banner>  banners = bannerMapper.selectList();
        for (int i=0;i<banners.size();i++){
            Banner bannerItem = banners.get(i);
            BannerVO bannerVO = new BannerVO();
            BeanUtils.copyProperties(bannerItem, bannerVO);
            bannerVOList.add(bannerVO);
        }
        return bannerVOList;
    }
}
