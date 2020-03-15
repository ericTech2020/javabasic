package com.java.javabasic.basic.collectionDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {




    public static void main(String[] args) {

        List<String> cars=new ArrayList<String>();
        ArrayList<String> animals=new ArrayList<String>();
        cars.add("benz");
        cars.add("ferrari");
        cars.add("toyota");

        for (String car:cars ) {

            System.out.println(car);
        }




        System.out.println(cars.toString());
        System.out.println(cars.get(0));

    }
}
