package com.example.dy.mytime.UserPackage;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class PasswordControllerTest {
    @Before
    public  void  setUp(){
        UserId.getInstance().setUserId(10);
    }

    @Test
    public void changePasswordTest0() {
        PasswordController passwordController = new PasswordController();
        passwordController.changePassword("123");
        assertThat(PasswordController.message,is("1"));
    }

    @Test
    public void changePasswordTest1() {
        PasswordController passwordController = new PasswordController();
        passwordController.changePassword(null);
        assertThat(PasswordController.message,is("-1"));
    }
}