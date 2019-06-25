package com.example.dy.mytime.UserPackage;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class UserControllerTest {

    @Test
    public void getUserTest0() {
        UserController userController = new UserController();
        assertThat(userController.getUser(-1),nullValue());
    }

    @Test
    public void getUserTest1() {
        UserController userController = new UserController();
        User user = userController.getUser(10);
        assertThat(user.getUserID(),is(10));
    }

    @Test
    public void getUserTest2() {
        UserController userController = new UserController();
        assertThat(userController.getUser(100),nullValue());
    }
}