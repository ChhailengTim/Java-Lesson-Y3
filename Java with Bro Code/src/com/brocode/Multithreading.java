package com.brocode;

public class Multithreading {
    public static void main(String[] args) throws InterruptedException {
        /*
        multithreading = Process of executing multiple threads simultaneously
                         Helps maximum utilization of CPU
                         Threads are independent, they don't affect the execution of other threads.
                         An exception in one thread will not interrupt other threads
                         useful for serving multiple clients, multiplayer games, or other mutually independent
         */

        //MyThreads threads1=new MyThreads();

        //MyRunnable runnable1=new MyRunnable();
        //Thread thread2=new Thread(runnable1);

        //threads1.setDaemon(true);
        //thread2.setDaemon(true);

        //threads1.start();
        //thread2.join(); //calling thread (ex.main) waits until the specified
        //thread2.start();

        //System.out.println(1/0);

        //Create a subclass of Thread
        MyThread thread1=new MyThread();

        //or

        //implement Runnable interface and pass instance as an argument to Thread
        MyRunnable runnable1=new MyRunnable();
        Thread thread2=new Thread(runnable1);

        thread1.start();
        thread2.start();
    }
}
