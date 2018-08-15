package com.cc.o2o.service;

import com.cc.o2o.dto.ShopExecution;
import com.cc.o2o.entity.Shop;
import com.cc.o2o.exception.ShopOperationException;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.InputStream;

public interface ShopService {
    ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName) throws ShopOperationException;
}
