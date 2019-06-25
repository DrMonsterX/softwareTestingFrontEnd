package com.example.dy.mytime.UserPackage;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class LoginControllerTest {

    @Test
    public void checkLoginTest0() {
        LoginController loginController = new LoginController();
        assertThat(loginController.checkLogin(100,"123"),is(2));
    }

    @Test
    public void checkLoginTest1() {
        LoginController loginController = new LoginController();
        assertThat(loginController.checkLogin(100,null),is(2));
    }

    @Test
    public void checkLoginTest2() {
        LoginController loginController = new LoginController();
        assertThat(loginController.checkLogin(10,"123"),is(0));
    }

    @Test
    public void checkLoginTest3() {
        LoginController loginController = new LoginController();
        assertThat(loginController.checkLogin(10,"321"),is(1));
    }

    @Test
    public void checkLoginTest4() {
        LoginController loginController = new LoginController();
        assertThat(loginController.checkLogin(10,null),is(1));
    }
}