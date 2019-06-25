package com.example.dy.mytime.UserPackage;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class RegistControllerTest {

    @Test
    public void registerTest0() {
        RegistController registController = new RegistController();
        assertThat(registController.register("Test4",1,"123"),greaterThan(0));
    }

    @Test
    public void registerTest1() {
        RegistController registController = new RegistController();
        assertThat(registController.register(null,1,"123"),is(-1));
    }

    @Test
    public void registerTest2() {
        RegistController registController = new RegistController();
        assertThat(registController.register("Test4",1,null),is(-1));
    }
}