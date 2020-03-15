package com.java.javabasic.basic.collectionDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {


    public static void main(String[] args) {

        Map <String,String> capitalCities=new HashMap<String,String>();
        capitalCities.put("England","London");
        capitalCities.put("China","BeiJing");
        capitalCities.put("Singapore","Singapore");


        for (String citi: capitalCities.values()) {
            System.out.println(citi);
        }

        for (String citi: capitalCities.keySet()) {
            System.out.println(citi);
        }


    }
}
