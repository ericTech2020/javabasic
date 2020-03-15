package com.java.javabasic.thread;

import java.util.concurrent.Callable;

public class MyCallableWithParameter implements Callable<String> {

    private String paramter1;

    public MyCallableWithParameter(String paramter1) {
        this.paramter1 = paramter1;
    }

    @Override
    public String call() throws Exception{
        String value="test";
        System.out.println("Ready to work");
        Thread.currentThread().sleep(2000);
        System.out.println(paramter1+" task done");
        return  value;
    }

}
