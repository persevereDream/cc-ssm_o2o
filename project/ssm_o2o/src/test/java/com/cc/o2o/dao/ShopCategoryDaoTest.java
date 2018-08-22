package com.cc.o2o.dao;

import com.cc.o2o.BaseTest;
import com.cc.o2o.entity.ShopCategory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ShopCategoryDaoTest extends BaseTest {

    @Autowired
    private ShopCategoryDao shopCategoryDao;

    @Test
    public void testQueryShopCategory() {

        List<ShopCategory> shopCategories = shopCategoryDao.queryShopCategory(new ShopCategory());
        assertNotEquals(0,shopCategories.size());

        ShopCategory testCategory = new ShopCategory();
        ShopCategory parentCategory = new ShopCategory();
        parentCategory.setShopCategoryId(10L);
        testCategory.setParent(parentCategory);
        shopCategories = shopCategoryDao.queryShopCategory(testCategory);
        assertNotEquals(0,shopCategories.size());
    }
}