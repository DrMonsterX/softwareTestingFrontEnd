package com.example.dy.mytime.SchedulePackage;

import android.support.test.runner.AndroidJUnit4;

import com.example.dy.mytime.UserPackage.UserId;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class AddScheduleControllerTest {
    @Before
    public void setUp(){
        UserId.getInstance().setUserId(10);
    }

    @Test
    public void addScheduleTest0() {
        AddScheduleController addScheduleController = new AddScheduleController();
        addScheduleController.addSchedule("Test2","123","321","",1);
        assertThat(Integer.parseInt(AddScheduleController.message),greaterThan(0));
    }

    @Test
    public void addScheduleTest1() {
        AddScheduleController addScheduleController = new AddScheduleController();
        addScheduleController.addSchedule(null,"123","321","",1);
        assertThat(AddScheduleController.message,is("0"));
    }

    @Test
    public void addScheduleTest2() {
        AddScheduleController addScheduleController = new AddScheduleController();
        addScheduleController.addSchedule("Test2",null,"321","",1);
        assertThat(AddScheduleController.message,is("0"));
    }

    @Test
    public void addScheduleTest3() {
        AddScheduleController addScheduleController = new AddScheduleController();
        addScheduleController.addSchedule("Test2","123",null,"",1);
        assertThat(AddScheduleController.message,is("0"));
    }
}