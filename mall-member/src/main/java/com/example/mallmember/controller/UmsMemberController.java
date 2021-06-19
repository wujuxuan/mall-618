package com.example.mallmember.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.mallcoupon.entity.SmsCouponEntity;
import com.example.mallmember.openFeign.CouponOpenFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wubaba.mall.util.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mallcoupon.entity.UmsMemberEntity;
import com.example.mallmember.service.UmsMemberService;




/**
 * 会员
 *
 * @author wujuxan
 * @email 100742839@qq.com
 * @date 2021-06-19 15:07:53
 */
@RestController
@RequestMapping("mallmember/umsmember")
public class UmsMemberController {
    @Autowired
    private UmsMemberService umsMemberService;

    @Autowired
    private CouponOpenFeign couponOpenFeign;

    /**
     * 测试
     */
    @RequestMapping("test/{id}")
    public R list (@PathVariable("id") Long id){
        R list = couponOpenFeign.list(id);

        return list;
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(Page pageForm, UmsMemberEntity umsMember){
        Page page = umsMemberService.page(pageForm, Wrappers.query(umsMember));
        return R.success("查询成功",page);
    }


    /**
     * 查询一条
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		UmsMemberEntity umsMember = umsMemberService.getById(id);
        return R.success("查询成功",umsMember);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UmsMemberEntity umsMember){
		umsMemberService.save(umsMember);

        return R.success("保存成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UmsMemberEntity umsMember){
		umsMemberService.updateById(umsMember);

        return R.success("修改成功");
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberService.removeByIds(Arrays.asList(ids));
        return R.success("删除成功");
    }


}
