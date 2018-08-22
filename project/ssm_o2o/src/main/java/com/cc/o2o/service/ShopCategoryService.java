package com.cc.o2o.service;

import com.cc.o2o.entity.ShopCategory;

import java.util.List;

public interface ShopCategoryService {

    List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);

}
