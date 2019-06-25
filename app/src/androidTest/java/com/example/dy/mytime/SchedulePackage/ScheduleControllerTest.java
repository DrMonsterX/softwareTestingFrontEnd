package com.example.dy.mytime.SchedulePackage;

import android.support.test.runner.AndroidJUnit4;

import com.example.dy.mytime.UserPackage.User;
import com.example.dy.mytime.UserPackage.UserId;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ScheduleControllerTest {
    @Before
    public void setUp() {
        UserId.getInstance().setUserId(10);
    }

    @Test
    public void getScheduleByDayTest0() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getScheduleByDay(null),is(empty()));
    }

    @Test
    public void getScheduleByDayTest1() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getScheduleByDay("123"),is(empty()));
    }

    @Test
    public void getScheduleByDayTest2() {
        ScheduleController scheduleController = new ScheduleController();
        List<Schedule> list = scheduleController.getScheduleByDay("2019-6-25");
        assertThat(list.size(),greaterThan(0));
    }

    @Test
    public void getScheduleByDayTest3() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getScheduleByDay("2019-6-28"),is(empty()));
    }

    @Test
    public void getScheduleByIdTest0() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getScheduleById(-1),nullValue());
    }

    @Test
    public void getScheduleByIdTest1() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getScheduleById(5),notNullValue());
    }

    @Test
    public void getScheduleByIdTest2() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getScheduleById(100),nullValue());
    }

    @Test
    public void getDBPositionTest0() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getDBPosition(null),is(0));
    }

    @Test
    public void getDBPositionTest1() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getDBPosition("132"),is(0));
    }

    @Test
    public void getDBPositionTest2() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getDBPosition("2019-6-32"),is(0));
    }

    @Test
    public void getDBPositionTest3() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getDBPosition("2019-6-25"),is(1));
    }

    @Test
    public void getDBPositionTest4() {
        ScheduleController scheduleController = new ScheduleController();
        assertThat(scheduleController.getDBPosition("2019-6-28"),is(0));
    }
}