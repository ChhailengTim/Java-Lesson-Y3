package com.brocode;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import static java.util.Calendar.DECEMBER;
import static java.util.Calendar.JUNE;

public class TimerTaskDemo {
    public static void main(String[] args){
        // Timer = A facility for threads to schedule tasks
        //         for future execution in a background thread

        // TimerTask = A task that can be scheduled for ont-time
        //             or repeated execution by a Timer

        Timer timer=new Timer();

        TimerTask task=new TimerTask() {
            int counter=10;
            @Override
            public void run() {
                //System.out.println("Task is complete :)");
                if(counter>0){
                    System.out.println(counter+" seconds");
                    counter--;
                }
                else {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }
        };
        Calendar date=Calendar.getInstance();
        date.set(Calendar.YEAR,2021);
        date.set(Calendar.MONTH,DECEMBER);
        date.set(Calendar.DAY_OF_MONTH,31);
        date.set(Calendar.HOUR_OF_DAY,23);
        date.set(Calendar.MINUTE,59);
        date.set(Calendar.SECOND,50);
        date.set(Calendar.MILLISECOND,0);



        //timer.schedule(task,0);
        //timer.schedule(task,date.getTime());
        //timer.scheduleAtFixedRate(task,0,1000);
        timer.schedule(task,date.getTime(),1000);


    }
}
