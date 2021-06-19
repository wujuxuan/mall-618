package com.example.mallmember.controller;

import java.util.Arrays;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.wubaba.mall.util.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mallcoupon.entity.UmsIntegrationChangeHistoryEntity;
import com.example.mallmember.service.UmsIntegrationChangeHistoryService;




/**
 * 积分变化历史记录
 *
 * @author wujuxan
 * @email 100742839@qq.com
 * @date 2021-06-19 15:07:53
 */
@RestController
@RequestMapping("mallmember/umsintegrationchangehistory")
public class UmsIntegrationChangeHistoryController {
    @Autowired
    private UmsIntegrationChangeHistoryService umsIntegrationChangeHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(Page pageForm, UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory){
        Page page = umsIntegrationChangeHistoryService.page(pageForm, Wrappers.query(umsIntegrationChangeHistory));
        return R.success("查询成功",page);
    }


    /**
     * 查询一条
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory = umsIntegrationChangeHistoryService.getById(id);

       // return R.ok().put("umsIntegrationChangeHistory", umsIntegrationChangeHistory);
        return R.success("查询成功",umsIntegrationChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory){
		umsIntegrationChangeHistoryService.save(umsIntegrationChangeHistory);

        return R.success("保存成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UmsIntegrationChangeHistoryEntity umsIntegrationChangeHistory){
		umsIntegrationChangeHistoryService.updateById(umsIntegrationChangeHistory);

        return R.success("修改成功");
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		umsIntegrationChangeHistoryService.removeByIds(Arrays.asList(ids));
        return R.success("删除成功");
    }


}
