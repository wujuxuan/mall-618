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
import com.example.mallcoupon.entity.SmsSkuLadderEntity;
import com.example.mallcoupon.service.SmsSkuLadderService;




/**
 * 商品阶梯价格
 *
 * @author wujuxan
 * @email 100742839@qq.com
 * @date 2021-06-19 15:02:26
 */
@RestController
@RequestMapping("mallcoupon/smsskuladder")
public class SmsSkuLadderController {
    @Autowired
    private SmsSkuLadderService smsSkuLadderService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(Page pageForm, SmsSkuLadderEntity smsSkuLadder){
        Page page = smsSkuLadderService.page(pageForm, Wrappers.query(smsSkuLadder));
        return R.success("查询成功",page);
    }


    /**
     * 查询一条
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsSkuLadderEntity smsSkuLadder = smsSkuLadderService.getById(id);

       // return R.ok().put("smsSkuLadder", smsSkuLadder);
        return R.success("查询成功",smsSkuLadder);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsSkuLadderEntity smsSkuLadder){
		smsSkuLadderService.save(smsSkuLadder);

        return R.success("保存成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsSkuLadderEntity smsSkuLadder){
		smsSkuLadderService.updateById(smsSkuLadder);

        return R.success("修改成功");
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsSkuLadderService.removeByIds(Arrays.asList(ids));
        return R.success("删除成功");
    }


}
