package com.example.dy.mytime.SchedulePackage;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class DeleteScheduleControllerTest {

    @Test
    public void deleteScheduleTest0() {
        DeleteScheduleController deleteScheduleController = new DeleteScheduleController();
        deleteScheduleController.deleteSchedule(-1);
        assertThat(DeleteScheduleController.message,is("0"));
    }

    @Test
    public void deleteScheduleTest2() {
        DeleteScheduleController deleteScheduleController = new DeleteScheduleController();
        deleteScheduleController.deleteSchedule(100);
        assertThat(DeleteScheduleController.message,is("0"));
    }
}