package com.cc.o2o.entity;

import java.util.Date;

public class LocalAuth {
    private Long localAuthId;
    private String username;
    private String password;
    private Date createTime;
    private Date lastEditTime;
    private PersonInfo personInfo;

    public Long getLocalAuthId() {
        return localAuthId;
    }

    public LocalAuth setLocalAuthId(Long localAuthId) {
        this.localAuthId = localAuthId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public LocalAuth setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LocalAuth setPassword(String password) {
        this.password = password;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public LocalAuth setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public LocalAuth setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
        return this;
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public LocalAuth setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LocalAuth{");
        sb.append("localAuthId=").append(localAuthId);
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", personInfo=").append(personInfo);
        sb.append('}');
        return sb.toString();
    }
}
