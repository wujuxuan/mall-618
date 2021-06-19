package com.example.mallmember.openFeign;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mallcoupon.entity.SmsCouponEntity;
import com.wubaba.mall.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("mall-coupon")
public interface CouponOpenFeign {
    @RequestMapping("mallcoupon/smscoupon/info/{id}")
    R list(@PathVariable("id") Long id);
}
