package com.cc.o2o.entity;

import java.util.Date;

public class ShopCategory {
    private Long shopCategoryId;
    private String shopCategoryName;
    private String shopCategoryDesc;
    private String shopCategoryImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    private ShopCategory parent;

    public Long getShopCategoryId() {
        return shopCategoryId;
    }

    public ShopCategory setShopCategoryId(Long shopCategoryId) {
        this.shopCategoryId = shopCategoryId;
        return this;
    }

    public String getShopCategoryName() {
        return shopCategoryName;
    }

    public ShopCategory setShopCategoryName(String shopCategoryName) {
        this.shopCategoryName = shopCategoryName;
        return this;
    }

    public String getShopCategoryDesc() {
        return shopCategoryDesc;
    }

    public ShopCategory setShopCategoryDesc(String shopCategoryDesc) {
        this.shopCategoryDesc = shopCategoryDesc;
        return this;
    }

    public String getShopCategoryImg() {
        return shopCategoryImg;
    }

    public ShopCategory setShopCategoryImg(String shopCategoryImg) {
        this.shopCategoryImg = shopCategoryImg;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public ShopCategory setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public ShopCategory setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public ShopCategory setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
        return this;
    }

    public ShopCategory getParent() {
        return parent;
    }

    public ShopCategory setParent(ShopCategory parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ShopCategory{");
        sb.append("shopCategoryId=").append(shopCategoryId);
        sb.append(", shopCategoryName='").append(shopCategoryName).append('\'');
        sb.append(", shopCategoryDesc='").append(shopCategoryDesc).append('\'');
        sb.append(", shopCategoryImg='").append(shopCategoryImg).append('\'');
        sb.append(", priority=").append(priority);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", parent=").append(parent);
        sb.append('}');
        return sb.toString();
    }
}
