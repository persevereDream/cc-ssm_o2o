package com.cc.o2o.entity;

import java.util.Date;

public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    private String gender;
    //0，禁止使用本商城 1，允许使用本商城
    private Integer enableStatus;
    //1.顾客 2.店家 3.超级管理员
    private Integer userType;
    private Date createTime;
    private Date lastEditTime;

    public Long getUserId() {
        return userId;
    }

    public PersonInfo setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public String getName() {
        return name;
    }

    public PersonInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public PersonInfo setProfileImg(String profileImg) {
        this.profileImg = profileImg;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public PersonInfo setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public PersonInfo setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Integer getEnableStatus() {
        return enableStatus;
    }

    public PersonInfo setEnableStatus(Integer enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }

    public Integer getUserType() {
        return userType;
    }

    public PersonInfo setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public PersonInfo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public PersonInfo setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PersonInfo{");
        sb.append("userId=").append(userId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", profileImg='").append(profileImg).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", enableStatus=").append(enableStatus);
        sb.append(", userType=").append(userType);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append('}');
        return sb.toString();
    }
}
