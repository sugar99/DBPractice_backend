package com.example.dbpractice.service;

import com.example.dbpractice.entity.Area;

import java.util.List;

public interface AreaService {
    //不一定和AreaDao里的方法一一对应！！！

    //增删改查方法
    List<Area> getAreaList();
    Area getAreaById(int areaId);
    //insertArea&updateArea返回的int是受影响的行数
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);
}
