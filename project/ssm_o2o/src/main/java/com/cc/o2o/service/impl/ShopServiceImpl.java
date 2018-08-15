package com.cc.o2o.service.impl;

import com.cc.o2o.dao.ShopDao;
import com.cc.o2o.dto.ShopExecution;
import com.cc.o2o.entity.Shop;
import com.cc.o2o.enums.ShopStateEnum;
import com.cc.o2o.exception.ShopOperationException;
import com.cc.o2o.service.ShopService;
import com.cc.o2o.util.ImageUtil;
import com.cc.o2o.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopDao shopDao;

    @Override
    @Transactional
    public ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName) {
        //空值判断
        if (shop == null) {
            return new ShopExecution(ShopStateEnum.NULL_SHOP);
        }
        try {
            //给店铺信息赋初始值
            shop.setEnableStatus(0);
            shop.setCreateTime(new Date());
            shop.setLastEditTime(new Date());
            //添加店铺信息
            int effectedNum = shopDao.insertShop(shop);
            if (effectedNum <= 0) {
                throw new ShopOperationException("店铺创建失败");  //todo:事务只回滚RuntimeException类型的异常
            } else {
                if (shopImgInputStream != null) {
                    //存储图片
                    try {
                        addShopImg(shop, shopImgInputStream, fileName);
                    } catch (Exception e) {
                        throw new ShopOperationException("addShopImg error" + e.getMessage());
                    }
                }
                //更新店铺的图片地址
                effectedNum = shopDao.updateShop(shop);
                if (effectedNum <= 0) {
                    throw new ShopOperationException("更新图片地址失败");
                }
            }

        } catch (Exception e) {
            throw new ShopOperationException("addShop error:" + e.getMessage());
        }
        return new ShopExecution(ShopStateEnum.CHECK, shop);
    }

    /**
     * 存储图片
     *
     * @param shop
     * @param shopImgInpuStream
     */
    private void addShopImg(Shop shop, InputStream shopImgInpuStream, String fileName) throws IOException {
        //获取shop图片的相对值路径
        String dest = PathUtil.getShopImagePath(shop.getShopId());
        String shopImgAddr = ImageUtil.generateThumbnail(shopImgInpuStream, fileName,dest);
        shop.setShopImg(shopImgAddr);
    }


}
