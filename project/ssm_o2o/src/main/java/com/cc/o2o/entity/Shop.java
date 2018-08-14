package com.cc.o2o.entity;

import java.util.Date;

public class Shop {
    private Long shopId;
    private String shopName;
    private String shopDesc;
    private String shopAddr;
    private String phone;
    private String shopImg;
    private Integer priority;
    private Date createTime;
    private Date lastEditTime;
    //-1 不可用，0 审核中，1 可用
    private Integer enableStatus;
    //超级管理员给店家的提醒
    private String advice;
    private Area area;
    private PersonInfo owner;
    private ShopCategory shopCategory;

    public Long getShopId() {
        return shopId;
    }

    public Shop setShopId(Long shopId) {
        this.shopId = shopId;
        return this;
    }

    public String getShopName() {
        return shopName;
    }

    public Shop setShopName(String shopName) {
        this.shopName = shopName;
        return this;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public Shop setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
        return this;
    }

    public String getShopAddr() {
        return shopAddr;
    }

    public Shop setShopAddr(String shopAddr) {
        this.shopAddr = shopAddr;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Shop setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getShopImg() {
        return shopImg;
    }

    public Shop setShopImg(String shopImg) {
        this.shopImg = shopImg;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public Shop setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Shop setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public Shop setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
        return this;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public Shop setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public String getAdvice() {
        return advice;
    }

    public Shop setAdvice(String advice) {
        this.advice = advice;
        return this;
    }

    public Area getArea() {
        return area;
    }

    public Shop setArea(Area area) {
        this.area = area;
        return this;
    }

    public PersonInfo getOwner() {
        return owner;
    }

    public Shop setOwner(PersonInfo owner) {
        this.owner = owner;
        return this;
    }

    public ShopCategory getShopCategory() {
        return shopCategory;
    }

    public Shop setShopCategory(ShopCategory shopCategory) {
        this.shopCategory = shopCategory;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Shop{");
        sb.append("shopId=").append(shopId);
        sb.append(", shopName='").append(shopName).append('\'');
        sb.append(", shopDesc='").append(shopDesc).append('\'');
        sb.append(", shopAddr='").append(shopAddr).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", shopImg='").append(shopImg).append('\'');
        sb.append(", priority=").append(priority);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", enableStatus=").append(enableStatus);
        sb.append(", advice='").append(advice).append('\'');
        sb.append(", area=").append(area);
        sb.append(", owner=").append(owner);
        sb.append(", shopCategory=").append(shopCategory);
        sb.append('}');
        return sb.toString();
    }
}
