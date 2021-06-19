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
import com.example.mallcoupon.entity.SmsHomeSubjectEntity;
import com.example.mallcoupon.service.SmsHomeSubjectService;




/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author wujuxan
 * @email 100742839@qq.com
 * @date 2021-06-19 15:02:27
 */
@RestController
@RequestMapping("mallcoupon/smshomesubject")
public class SmsHomeSubjectController {
    @Autowired
    private SmsHomeSubjectService smsHomeSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(Page pageForm, SmsHomeSubjectEntity smsHomeSubject){
        Page page = smsHomeSubjectService.page(pageForm, Wrappers.query(smsHomeSubject));
        return R.success("查询成功",page);
    }


    /**
     * 查询一条
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsHomeSubjectEntity smsHomeSubject = smsHomeSubjectService.getById(id);

       // return R.ok().put("smsHomeSubject", smsHomeSubject);
        return R.success("查询成功",smsHomeSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsHomeSubjectEntity smsHomeSubject){
		smsHomeSubjectService.save(smsHomeSubject);

        return R.success("保存成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsHomeSubjectEntity smsHomeSubject){
		smsHomeSubjectService.updateById(smsHomeSubject);

        return R.success("修改成功");
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsHomeSubjectService.removeByIds(Arrays.asList(ids));
        return R.success("删除成功");
    }


}
