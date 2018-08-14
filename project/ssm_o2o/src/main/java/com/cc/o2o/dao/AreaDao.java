package com.cc.o2o.dao;

import com.cc.o2o.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 列出区域列表
     * @return areaList
     */
    public List<Area> queryArea();
}
