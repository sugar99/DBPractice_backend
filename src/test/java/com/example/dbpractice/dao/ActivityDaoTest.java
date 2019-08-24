package com.example.dbpractice.dao;

import com.example.dbpractice.entity.Activity;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)    //run with
@SpringBootTest
public class ActivityDaoTest {

    @Autowired
    private ActivityDao activityDao;

    @Test
    @Ignore
    public void queryActivity() {

    }

    @Test
    @Ignore
    public void queryCertifiedActivity() {
    }

    @Test
    @Ignore
    public void queryActivityById() {
    }

    @Test
    @Ignore
    public void queryActivityBySponsorId() {
    }

    @Test
    @Ignore
    public void insertActivity(){
        Activity activity = new Activity();
        activity.setTitle("毕业典礼");
        activity.setDate(new Date());
//        activity.setTag("学术");
        activity.setDesc("华工毕业典礼");
        activity.setPlace("A1-201");
        activity.setSponsor("201730686666");
        activity.setCertified(true);
        int effectedNum = activityDao.insertActivity(activity);
        assertEquals(1,effectedNum);
    }
}