package com.java.javabasic.basic.interfaceDemo;

public class Circle implements Shape {

    double radius;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has bee draw");
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}
