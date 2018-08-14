package com.cc.o2o.entity;

import java.util.Date;

public class Area {
    //ID
    private Integer areaId;
    //名称
    private String areaName;
    //权重
    private Integer priority;
    //创建时间
    private Date createTime;
    //更新时间
    private Date lastEditTime;

    public Integer getAreaId() {
        return areaId;
    }

    public Area setAreaId(Integer areaId) {
        this.areaId = areaId;
        return this;
    }

    public String getAreaName() {
        return areaName;
    }

    public Area setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public Area setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Area setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public Area setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Area{");
        sb.append("areaId=").append(areaId);
        sb.append(", areaName='").append(areaName).append('\'');
        sb.append(", priority=").append(priority);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append('}');
        return sb.toString();
    }
}
