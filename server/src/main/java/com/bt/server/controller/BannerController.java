package com.bt.server.controller;


import com.bt.server.common.ApiRestResponse;
import com.bt.server.exception.MallExceptionEnum;
import com.bt.server.model.HelloReq;
import com.bt.server.model.vo.BannerVO;
import com.bt.server.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/banner")
public class BannerController {


    @Autowired
    BannerService bannerService;
    @GetMapping("/list")
    @ResponseBody
    public ApiRestResponse list() {
        List<BannerVO> banners = bannerService.bannerList();
        return ApiRestResponse.success(banners);
    }
}
