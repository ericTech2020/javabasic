package com.java.javabasic.basic.interfaceDemo;

import com.java.javabasic.basic.abstractDemo.Animal;
import com.java.javabasic.basic.abstractDemo.Cat;

public class Main {

    public static void main(String[] args) {


        Shape rect=new Rectangle(2,3);
        System.out.println("Area of rect"+rect.area());

        System.out.println("Area of rect"+rect.area());

        Shape circle=new Circle(3);
        System.out.println("Area of circle"+circle.area());

        System.out.println(Shape.color);

    }
}
