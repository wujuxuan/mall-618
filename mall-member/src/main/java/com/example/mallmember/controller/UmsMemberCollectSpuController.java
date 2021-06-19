package com.example.mallmember.controller;

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
import com.example.mallmember.entity.UmsMemberCollectSpuEntity;
import com.example.mallmember.service.UmsMemberCollectSpuService;




/**
 * 会员收藏的商品
 *
 * @author wujuxan
 * @email 100742839@qq.com
 * @date 2021-06-19 15:07:53
 */
@RestController
@RequestMapping("mallmember/umsmembercollectspu")
public class UmsMemberCollectSpuController {
    @Autowired
    private UmsMemberCollectSpuService umsMemberCollectSpuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(Page pageForm, UmsMemberCollectSpuEntity umsMemberCollectSpu){
        Page page = umsMemberCollectSpuService.page(pageForm, Wrappers.query(umsMemberCollectSpu));
        return R.success("查询成功",page);
    }


    /**
     * 查询一条
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		UmsMemberCollectSpuEntity umsMemberCollectSpu = umsMemberCollectSpuService.getById(id);

       // return R.ok().put("umsMemberCollectSpu", umsMemberCollectSpu);
        return R.success("查询成功",umsMemberCollectSpu);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UmsMemberCollectSpuEntity umsMemberCollectSpu){
		umsMemberCollectSpuService.save(umsMemberCollectSpu);

        return R.success("保存成功");
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UmsMemberCollectSpuEntity umsMemberCollectSpu){
		umsMemberCollectSpuService.updateById(umsMemberCollectSpu);

        return R.success("修改成功");
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		umsMemberCollectSpuService.removeByIds(Arrays.asList(ids));
        return R.success("删除成功");
    }


}
