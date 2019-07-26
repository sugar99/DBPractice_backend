package com.example.dbpractice.service.impl;

import com.example.dbpractice.dao.AreaDao;
import com.example.dbpractice.entity.Area;
import com.example.dbpractice.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> getAreaList() {
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    @Transactional //事务控制（示例） 并不是所有异常都rollback 可用rollback for Exception.class
    @Override
    public boolean addArea(Area area) {
        //对传入值进行空值判断
        if(area.getAreaName()!=null&&"".equals(area.getAreaName())){
            //设置默认值
            area.setCreatedTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.insertArea(area);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入区域信息失败！");
                }
            } catch(Exception e){
                    throw new RuntimeException("插入区域信息失败！"+e.toString());
            }
        }else{
            throw new RuntimeException("区域信息不能为空！");
        }
    }

    @Override
    public boolean modifyArea(Area area) {
        //对传入值进行空值判断
        if(area.getAreaId()!=null&&"".equals(area.getAreaId())){
            //设置最后编辑时间
            area.setLastEditTime(new Date());
            try {
                int effectedNum = areaDao.updateArea(area);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新区域信息失败！");
                }
            } catch(Exception e){
                throw new RuntimeException("更新区域信息失败！"+e.toString());
            }
        }else{
            throw new RuntimeException("区域信息不能为空！");
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        if(areaId>0) {
            try {
                //删除区域信息
                int effectedNum = areaDao.deleteArea(areaId);
                if (effectedNum > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除区域信息失败！");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除区域信息失败！" + e.toString());
            }
        } else {
            throw new RuntimeException("区域ID不能为空！");
        }
    }
}
