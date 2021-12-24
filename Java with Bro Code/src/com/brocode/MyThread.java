package com.brocode;

public class MyThread extends Thread{

    @Override
    public void run(){

        if(this.isDaemon()){
            System.out.println("This is daemon thread is running");
        }
        else {
            System.out.println("This is a user thread that is running");
        }
    }
}
