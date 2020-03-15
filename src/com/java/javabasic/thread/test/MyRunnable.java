package com.java.javabasic.thread.test;

public class MyRunnable implements Runnable
{
    private String name;


    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+" my runnable");
    }


    public static void main(String[] args) {
        MyRunnable mr1=new MyRunnable("mr1");
        MyRunnable mr2=new MyRunnable("mr2");

        Thread t1=new Thread(mr1);
        Thread t2=new Thread(mr2);

        t1.start();
        t2.start();
    }
}
