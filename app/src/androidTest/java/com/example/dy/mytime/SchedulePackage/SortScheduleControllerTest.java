package com.example.dy.mytime.SchedulePackage;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class SortScheduleControllerTest {

    @Test
    public void resortScheduleTest0() {
        SortScheduleController sortScheduleController = new SortScheduleController();
        sortScheduleController.resortSchedule(100,1);
        assertThat(SortScheduleController.message,is("-2"));
    }

    @Test
    public void resortScheduleTest1() {
        SortScheduleController sortScheduleController = new SortScheduleController();
        sortScheduleController.resortSchedule(5,1);
        assertThat(SortScheduleController.message,is("1"));
    }
}