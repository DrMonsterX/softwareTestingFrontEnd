package com.example.dy.mytime.SchedulePackage;

import android.util.Log;

import com.example.dy.mytime.DatabasePackage.MyDatabaseController;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

public class DeleteScheduleController extends ScheduleController implements IDeleteSchedule {
    public static String message;

    public DeleteScheduleController(){
        super();

    }
    //删除日程
    public void deleteSchedule(final int scheduleId){
//        controller.deleteById("Schedule","Schedule_id",scheduleId);
        final  String path="http://119.3.217.215:8081/deleteSchedule?scheduleId=";

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient client = new OkHttpClient();
                Request request = new Request.Builder().url(path+scheduleId).build();
                try {
                    Response response = client.newCall(request).execute();//发送请求
                    String result = response.body().string();
                    Log.d(TAG, "result: "+result);
                    message = result;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        try {
            thread.join();//等待子线程执行结束后，主线程继续执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
