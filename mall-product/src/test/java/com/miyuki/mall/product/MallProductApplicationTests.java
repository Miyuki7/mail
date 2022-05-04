package com.miyuki.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.miyuki.mall.product.entity.BrandEntity;
import com.miyuki.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("hello");
//        brandEntity.setName("华为");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1));
        brand_id.forEach(System.out::println);
    }

}
