package com.cc.o2o.service.impl;

import com.cc.o2o.BaseTest;
import com.cc.o2o.dto.ShopExecution;
import com.cc.o2o.entity.Area;
import com.cc.o2o.entity.PersonInfo;
import com.cc.o2o.entity.Shop;
import com.cc.o2o.entity.ShopCategory;
import com.cc.o2o.enums.ShopStateEnum;
import com.cc.o2o.service.ShopService;
import com.cc.o2o.util.PathUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.Date;

import static org.junit.Assert.*;

public class ShopServiceTest extends BaseTest {

    @Autowired
    private ShopService shopService;

    @Test
    public void testAddShop() {
        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();
        owner.setUserId(10L);
        area.setAreaId(5);
        shopCategory.setShopCategoryId(10L);
        shop.setOwner(owner)
                .setArea(area)
                .setShopCategory(shopCategory)
                .setShopName("测试的店铺1")
                .setShopDesc("test1")
                .setShopAddr("test1")
                .setPhone("test1")
                .setCreateTime(new Date())
                .setEnableStatus(ShopStateEnum.CHECK.getState())
                .setAdvice("审核中");
        File shopImg = new File(PathUtil.getBasePath()+"/原图.png");
        ShopExecution se = shopService.addShop(shop, shopImg);
        assertEquals(ShopStateEnum.CHECK.getState(),se.getState());

    }
}