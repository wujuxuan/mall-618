package com.example.mallmember.openFeign;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mallcoupon.entity.SmsCouponEntity;
import com.wubaba.mall.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient
public interface CouponOpenFeign {
    @RequestMapping("/list")
    R list(Page pageForm, SmsCouponEntity smsCoupon);
}
