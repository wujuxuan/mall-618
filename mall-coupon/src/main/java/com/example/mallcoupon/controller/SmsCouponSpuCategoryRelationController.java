package com.example.mallcoupon.controller;

import java.util.Arrays;
import java.util.Map;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.wubaba.mall.util.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mallcoupon.entity.SmsCouponSpuCategoryRelationEntity;
import com.example.mallcoupon.service.SmsCouponSpuCategoryRelationService;




/**
 * 优惠券分类关联
 *
 * @author wujuxan
 * @email 100742839@qq.com
 * @date 2021-06-19 15:02:27
 */
@RestController
@RequestMapping("mallcoupon/smscouponspucategoryrelation")
public class SmsCouponSpuCategoryRelationController {
    @Autowired
    private SmsCouponSpuCategoryRelationService smsCouponSpuCategoryRelationService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(Page pageForm, SmsCouponSpuCategoryRelationEntity smsCouponSpuCategoryRelation){
        Page page = smsCouponSpuCategoryRelationService.page(pageForm, Wrappers.query(smsCouponSpuCategoryRelation));
        return R.success("查询成功",page);
    }


    /**
     * 查询一条
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsCouponSpuCategoryRelationEntity smsCouponSpuCategoryRelation = smsCouponSpuCategoryRelationService.getById(id);

       // return R.ok().put("smsCouponSpuCategoryRelation", smsCouponSpuCategoryRelation);
        return R.success("查询成功",smsCouponSpuCategoryRelation);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsCouponSpuCategoryRelationEntity smsCouponSpuCategoryRelation){
		smsCouponSpuCategoryRelationService.save(smsCouponSpuCategoryRelation);

        return R.success("保存成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsCouponSpuCategoryRelationEntity smsCouponSpuCategoryRelation){
		smsCouponSpuCategoryRelationService.updateById(smsCouponSpuCategoryRelation);

        return R.success("修改成功");
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsCouponSpuCategoryRelationService.removeByIds(Arrays.asList(ids));
        return R.success("删除成功");
    }


}
