package com.example.dy.mytime.SchedulePackage;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ModifyScheduleControllerTest {

    @Test
    public void changeScheduleTest0() {
        ModifyScheduleController modifyScheduleController = new ModifyScheduleController();
        modifyScheduleController.changeSchedule(100,"test","123","321","",1);
        assertThat(ModifyScheduleController.message,is("-2"));
    }

    @Test
    public void changeScheduleTest1() {
        ModifyScheduleController modifyScheduleController = new ModifyScheduleController();
        modifyScheduleController.changeSchedule(5,"test","2019-6-25 15:11","321","",1);
        assertThat(ModifyScheduleController.message,is("1"));
    }

    @Test
    public void changeScheduleTest2() {
        ModifyScheduleController modifyScheduleController = new ModifyScheduleController();
        modifyScheduleController.changeSchedule(5,null,"123","321","",1);
        assertThat(ModifyScheduleController.message,is("-1"));
    }

    @Test
    public void changeScheduleTest3() {
        ModifyScheduleController modifyScheduleController = new ModifyScheduleController();
        modifyScheduleController.changeSchedule(5,"test",null,"321","",1);
        assertThat(ModifyScheduleController.message,is("-1"));
    }

    @Test
    public void changeScheduleTest4() {
        ModifyScheduleController modifyScheduleController = new ModifyScheduleController();
        modifyScheduleController.changeSchedule(5,"test","123",null,"",1);
        assertThat(ModifyScheduleController.message,is("-1"));
    }
}