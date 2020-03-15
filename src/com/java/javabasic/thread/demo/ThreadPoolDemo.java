package com.java.javabasic.thread.demo;

import com.java.javabasic.thread.MyCallable;
import com.java.javabasic.thread.MyCallableWithParameter;

import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args)  {

        ExecutorService newCacheThradPool= Executors.newCachedThreadPool();
        Future<String> future=newCacheThradPool.submit(new MyCallable());
        //Future<String> future2=newCacheThradPool.submit(new MyCallableWithParameter("eric"));
        //Future<String> future3=newCacheThradPool.submit(new MyCallableWithParameter("alex"));

        if(!future.isDone())
        {
            System.out.println("task is not finished, please wait!");
        }

        try {
            System.out.println(future.get());
            /*System.out.println(future2.get());
            System.out.println(future3.get());*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        finally {
            newCacheThradPool.shutdown();
        }


    }
}
