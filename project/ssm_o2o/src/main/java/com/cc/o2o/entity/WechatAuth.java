package com.cc.o2o.entity;

import java.util.Date;

public class WechatAuth {
    private Long wechatAuthId;
    private String openId;
    private Date createTime;
    private PersonInfo personInfo;

    public Long getWechatAuthId() {
        return wechatAuthId;
    }

    public WechatAuth setWechatAuthId(Long wechatAuthId) {
        this.wechatAuthId = wechatAuthId;
        return this;
    }

    public String getOpenId() {
        return openId;
    }

    public WechatAuth setOpenId(String openId) {
        this.openId = openId;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public WechatAuth setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public WechatAuth setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("WechatAuth{");
        sb.append("wechatAuthId=").append(wechatAuthId);
        sb.append(", openId='").append(openId).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", personInfo=").append(personInfo);
        sb.append('}');
        return sb.toString();
    }
}
