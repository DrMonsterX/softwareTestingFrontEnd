package com.example.dy.mytime.SchedulePackage;

import com.example.dy.mytime.DatabasePackage.MyDatabaseController;

public class ModifyScheduleController extends ScheduleController implements IModifySchedule {
    public static String message;

    public ModifyScheduleController(){
        super();
    }
    //修改日程
    public void changeSchedule(int scheduleId,String schduleName,String startTime,String stopTime,String remark,int remind){
        if (schduleName == null || startTime == null || stopTime == null) {
            message = "-1";
            return;
        }
        Thread thread = new ModifyScheduleThread(scheduleId,schduleName,startTime,stopTime,remark,remind);
        thread.start();  //执行线程
        try {
            thread.join();//等待子线程执行结束后，主线程继续执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
