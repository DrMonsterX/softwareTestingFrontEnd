package com.example.dy.mytime.UserPackage;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class FollowControllerTest {
    @Before
    public void setUp(){
        UserId.getInstance().setUserId(10);
    }

    @Test
    public void getFollowTest0() {
        FollowController followController = new FollowController();
        assertThat(followController.getFollow(-1),is(empty()));
    }

    @Test
    public void getFollowTest1() {
        FollowController followController = new FollowController();
        assertThat(followController.getFollow(10),is(not(empty())));
    }

    @Test
    public void getFollowTest2() {
        FollowController followController = new FollowController();
        assertThat(followController.getFollow(100),is(empty()));
    }

    @Test
    public void followUserTest0() {
        FollowController followController = new FollowController();
        followController.followUser(100);
        assertThat(FollowController.message,is("-4"));
    }

    @Test
    public void followUserTest1() {
        FollowController followController = new FollowController();
        followController.followUser(10);
        assertThat(FollowController.message,is("-2"));
    }

    @Test
    public void followUserTest2() {
        FollowController followController = new FollowController();
        followController.followUser(12);
        assertThat(FollowController.message,is("1"));
    }

    @Test
    public void deleteFollowTest0() {
        FollowController followController = new FollowController();
        followController.deleteFollow(100);
        assertThat(FollowController.message,is("-4"));
    }

    @Test
    public void deleteFollowTest1() {
        FollowController followController = new FollowController();
        followController.deleteFollow(10);
        assertThat(FollowController.message,is("-2"));
    }

    @Test
    public void deleteFollowTest2() {
        FollowController followController = new FollowController();
        followController.deleteFollow(11);
        assertThat(FollowController.message,is("1"));
    }

    @Test
    public void deleteFollowTest3() {
        FollowController followController = new FollowController();
        followController.deleteFollow(5);
        assertThat(FollowController.message,is("0"));
    }
}