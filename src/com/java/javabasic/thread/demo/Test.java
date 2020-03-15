package com.java.javabasic.thread.demo;

import com.java.javabasic.thread.MyCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {

    public static void main(String[] args) {

        ExecutorService threadPool=Executors.newFixedThreadPool(3);

        MyCallable mc=new MyCallable();
        Future<String> future= threadPool.submit(mc);
        Future<String> future2= threadPool.submit(mc);
        Future<String> future3= threadPool.submit(mc);


        if (!future.isDone()){
            System.out.println("thread not done");
        }

        try {
            System.out.println(future.get()+future2.get()+future3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        finally {
            threadPool.shutdown();
        }


    }
}
