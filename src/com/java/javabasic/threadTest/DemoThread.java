package com.java.javabasic.threadTest;

public class DemoThread extends Thread {


    private String name;
    public DemoThread(String name){
        this.name=name;
    }


    @Override
    public void run() {

        for (int i=0;i<10;i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread start "+this.name+" i="+i);
        }
    }








}
