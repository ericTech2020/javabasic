package com.java.javabasic.basic.polymorphism;

public class Cat implements Actionable {

    private Actionable ac;

    @Override
    public void eat() {
        System.out.println("cat eat");
    }

    @Override
    public void move() {
        System.out.println("cat move");
    }
}
