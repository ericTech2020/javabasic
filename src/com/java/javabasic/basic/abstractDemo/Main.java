package com.java.javabasic.basic.abstractDemo;

import com.sun.org.apache.xerces.internal.dom.AttrNSImpl;

public class Main {

    public static void main(String[] args) {

        Animal cat=new Cat();
        cat.animalSound();
        cat.sleep();

        cat.ModifiedAge(8);
        System.out.println(cat.getAge());


        Animal.eat();


    }
}
