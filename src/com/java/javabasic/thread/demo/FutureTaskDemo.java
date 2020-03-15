package com.java.javabasic.thread.demo;

import com.java.javabasic.thread.MyCallable;
import com.java.javabasic.thread.MyCallableWithParameter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {


        /*FutureTask<String> futureTask=new FutureTask<String>(new MyCallable());
        Thread t1= new Thread(futureTask);
        t1.start();
        if (!futureTask.isDone())
        {
            System.out.println("task not finished, please wait");
        }
        System.out.println("task return "+futureTask.get());*/

        FutureTask<String> futureTask=new FutureTask<String>(new MyCallableWithParameter("eric"));
        Thread t1= new Thread(futureTask);
        t1.start();
        if (!futureTask.isDone())
        {
            System.out.println("task not finished, please wait");
        }
        System.out.println("task return "+futureTask.get());

    }
}
