package com.cc.o2o.dto;

import com.cc.o2o.entity.Shop;
import com.cc.o2o.enums.ShopStateEnum;

import java.util.List;

public class ShopExecution {
    //结果状态
    private int state;

    //状态标识
    private String stateInfo;

    //店铺的数量
    private int count;

    //操作的shop（增删改店铺的时候用到）
    private Shop shop;

    //shop列表（查询店铺列表的时候使用）
    private List<Shop> shopList;

    public ShopExecution() {
    }

    //店铺操作失败的时候使用的构造器
    public ShopExecution(ShopStateEnum shopStateEnum){
        this.state = shopStateEnum.getState();
        this.stateInfo = shopStateEnum.getStateInfo();
    }

    //店铺操作成功的时候使用的构造器
    public ShopExecution(ShopStateEnum stateEnum,Shop shop){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shop = shop;
    }

    //店铺操作成功的时候使用的构造器
    public ShopExecution(ShopStateEnum stateEnum,List<Shop> shopList){
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.shopList = shopList;
    }

    public int getState() {
        return state;
    }

    public ShopExecution setState(int state) {
        this.state = state;
        return this;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public ShopExecution setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
        return this;
    }

    public int getCount() {
        return count;
    }

    public ShopExecution setCount(int count) {
        this.count = count;
        return this;
    }

    public Shop getShop() {
        return shop;
    }

    public ShopExecution setShop(Shop shop) {
        this.shop = shop;
        return this;
    }

    public List<Shop> getShopList() {
        return shopList;
    }

    public ShopExecution setShopList(List<Shop> shopList) {
        this.shopList = shopList;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ShopExecution{");
        sb.append("state=").append(state);
        sb.append(", stateInfo='").append(stateInfo).append('\'');
        sb.append(", count=").append(count);
        sb.append(", shop=").append(shop);
        sb.append(", shopList=").append(shopList);
        sb.append('}');
        return sb.toString();
    }
}
