package com.example.dy.mytime.TaskPackage;

import android.util.Log;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

public class deleteAllNodeThread extends Thread {

    private int taskId;

    //重定义构造函数，获取id
    public deleteAllNodeThread(int taskId){
        this.taskId=taskId;


    }

    final String path="http://119.3.217.215:8081/deleteAllNode?taskId=";

    public void run() {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(path+taskId).build();
        try {
            Response response = client.newCall(request).execute();//发送请求
            String result = response.body().string();
            Log.d(TAG, "result: "+result);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
