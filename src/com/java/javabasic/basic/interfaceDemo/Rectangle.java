package com.java.javabasic.basic.interfaceDemo;

public class Rectangle implements Shape {

    int length,width;

    Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle has bee draw");
    }

    @Override
    public double area() {
        return length*width;
    }
}
