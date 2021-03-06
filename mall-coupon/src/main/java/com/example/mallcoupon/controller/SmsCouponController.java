package com.example.mallcoupon.controller;

import java.util.Arrays;
import java.util.Map;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wubaba.mall.util.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mallcoupon.entity.SmsCouponEntity;
import com.example.mallcoupon.service.SmsCouponService;




/**
 * 优惠券信息
 *
 * @author wujuxan
 * @email 100742839@qq.com
 * @date 2021-06-19 15:02:27
 */
@RestController
@RequestMapping("mallcoupon/smscoupon")
public class SmsCouponController {
    @Autowired
    private SmsCouponService smsCouponService;


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(Page pageForm, SmsCouponEntity smsCoupon){
        Page page = smsCouponService.page(pageForm, Wrappers.query(smsCoupon));
        return R.success("查询成功",page);
    }


    /**
     * 查询一条
     */
    @ResponseBody
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsCouponEntity smsCoupon = smsCouponService.getById(id);
        System.out.println(smsCoupon);
        return R.success("查询成功",smsCoupon);


    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsCouponEntity smsCoupon){
		smsCouponService.save(smsCoupon);

        return R.success("保存成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsCouponEntity smsCoupon){
		smsCouponService.updateById(smsCoupon);

        return R.success("修改成功");
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsCouponService.removeByIds(Arrays.asList(ids));
        return R.success("删除成功");
    }


}
