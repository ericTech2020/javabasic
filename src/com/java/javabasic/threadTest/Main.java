package com.java.javabasic.threadTest;

import com.java.javabasic.basic.abstractDemo.Animal;
import com.java.javabasic.basic.abstractDemo.Cat;

public class Main {

    public static void main(String[] args) {

       DemoThread t1=new DemoThread("Thread 1");
       DemoThread t2=new DemoThread("Thread 2");
       DemoThread t3=new DemoThread("Thread 3");

       t1.start();
       t2.start();
       t3.start();

    }
}
