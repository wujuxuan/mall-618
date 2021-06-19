package com.example.mallproduct;

import com.example.mallproduct.entity.BrandEntity;
import com.example.mallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("测试哈哈哈1");
        brandEntity.setLogo("测试");
        brandEntity.setName("华为测试");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
