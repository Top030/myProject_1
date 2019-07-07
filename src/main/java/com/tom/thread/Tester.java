package com.tom.thread;

public class Tester {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("main: " +i);
        }
        Thread thread= new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("thread: " +i);
                }
            }
        };
        thread.start();
        //MyThread
        MyThread myThread= new MyThread();
        myThread.start();
        //Runnable
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("runnable: "+ i);
                }
            }
        };
        Thread r= new Thread(runnable);
        r.start();
        System.out.println("main end");
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+ ":"+ i );
        }
    }
}