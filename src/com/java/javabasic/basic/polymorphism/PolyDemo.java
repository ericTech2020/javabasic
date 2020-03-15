package com.java.javabasic.basic.polymorphism;

import com.java.javabasic.thread.MyThread;


public class PolyDemo {
    public static void main(String[] args) {

        Cat cat =new Cat();
        Animal animal=new Animal(cat);
        animal.eat();

    }
}
