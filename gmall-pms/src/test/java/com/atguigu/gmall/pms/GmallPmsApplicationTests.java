package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.dao.BrandDao;
import com.atguigu.gmall.pms.entity.BrandEntity;
import com.atguigu.gmall.pms.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {


    @Autowired
    private BrandDao brandDao;

    @Autowired
    private BrandService brandService;
    @Test
    void contextLoads() {
    }

    @Test
    public void Test(){
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("你真帅asxa！！");
//        brandEntity.setFirstLetter("S");
//        brandEntity.setLogo("www.zhenshuai/log.gif");
//        brandEntity.setName("帅的一塌糊涂");
//        brandEntity.setShowStatus(0);
//        brandEntity.setSort(1);
//        this.brandDao.insert(brandEntity);
        //System.out.println(this.brandDao.selectList(new QueryWrapper<BrandEntity>().eq("name", "尚硅谷")));
//        IPage<BrandEntity>page = this.brandDao.selectPage(new Page<BrandEntity>(2,2),null);
//        System.out.println(page.getRecords());
//        System.out.println(page.getTotal());
//        System.out.println(page.getPages());

        IPage<BrandEntity> page1 = this.brandService.page(new Page<BrandEntity>(3L,1L),new QueryWrapper<BrandEntity>().eq("sort",1));
        System.out.println(page1.getRecords());
        System.out.println(page1.getTotal());
        System.out.println(page1.getPages());
    }



}
