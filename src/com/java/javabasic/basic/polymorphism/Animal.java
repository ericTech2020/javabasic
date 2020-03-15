package com.java.javabasic.basic.polymorphism;

public class Animal implements Actionable {

    private Actionable actionable;

    @Override
    public void eat(){
        if(actionable!=null)
        {
            actionable.eat();
        }
    }

    @Override
    public void move() {
        System.out.println("animal move");
    }

    public Animal(Actionable actionable) {
        this.actionable = actionable;
    }
}
