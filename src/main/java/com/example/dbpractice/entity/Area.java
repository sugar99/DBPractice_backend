package com.example.dbpractice.entity;

import java.util.Date;

//实体类
public class Area {
    //主键ID
    private Integer areaId;
    //名称
    private String areaName;
    //权重，越大越靠前
    private Integer priority;
    //创建时间
    private Date createdTime;
    //更新时间
    private Date lastEditTime;

    public Integer getAreaId() {
        return areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
