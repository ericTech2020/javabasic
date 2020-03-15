package com.java.javabasic.basic.innerClassDemo;



public class Main {

    public static void main(String[] args) {

           OuterClass outerInstance=new OuterClass();
           OuterClass.InnerClass innerClass=outerInstance.new InnerClass();


           outerInstance.outerField=19;
           int outerFiled=outerInstance.outerField;
           System.out.println(outerFiled );


    }
}
