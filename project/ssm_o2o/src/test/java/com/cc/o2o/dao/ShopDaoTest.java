package com.cc.o2o.dao;

import com.cc.o2o.BaseTest;
import com.cc.o2o.entity.Area;
import com.cc.o2o.entity.PersonInfo;
import com.cc.o2o.entity.Shop;
import com.cc.o2o.entity.ShopCategory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class ShopDaoTest extends BaseTest {
    @Autowired
    private ShopDao shopDao;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testInsertShop() {
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
                .setShopName("测试的店铺")
                .setShopDesc("test")
                .setShopAddr("test")
                .setPhone("test")
                .setShopImg("test")
                .setCreateTime(new Date())
                .setEnableStatus(1)
                .setAdvice("审核中");
        int effectedNum = shopDao.insertShop(shop);
        assertEquals(1,effectedNum);
    }

    @Test
    public void teatUpdateShop() {
        Shop shop = new Shop();
        shop.setShopId(29L)
                .setShopDesc("测试描述")
                .setShopAddr("测试地址")
                .setLastEditTime(new Date());
        int effectedNum = shopDao.updateShop(shop);
        assertEquals(1,effectedNum);

    }
}