package com.example.dbpractice.dao;

import com.example.dbpractice.entity.Area;

import java.util.List;

//创建Dao层 interface
public interface AreaDao {
    //增删改查方法
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    //insertArea&updateArea返回的int是受影响的行数
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
