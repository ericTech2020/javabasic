package com.java.javabasic.basic.enumDemo;

public class enumDemo {

    enum Level{
        LOW,MEDIUM,HIGH
    }

    public static void main(String[] args) {
        Level myLevel=Level.HIGH;
        System.out.println(myLevel);

        for(Level myVar:Level.values()){
            System.out.println(myVar);
        }
    }
}
