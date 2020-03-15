package com.java.javabasic.basic.abstractDemo;

public abstract class Animal {

    private static int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public abstract void animalSound();

    public void sleep(){
        System.out.println("zzz");
    }

    //抽象类可以有自己的方法具体实现和static类，interface 不可以
    public static void eat()
    {
        System.out.println("delicious");
        fun();
    }

    private static void fun()
    {
        System.out.println("happy");
    }

    public void ModifiedAge(int age){
        this.age=age;
    }
}
