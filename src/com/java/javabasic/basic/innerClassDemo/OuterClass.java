package com.java.javabasic.basic.innerClassDemo;

public class OuterClass {

    int outerField=10;

    private void SetOuterMehod(int x){
        this.outerField=x;
    }

    class InnerClass{

        int innerField=10;

        private void SetInnerMethod(int y){
            this.innerField=y;
        }


    }

}

