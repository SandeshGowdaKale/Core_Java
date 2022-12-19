package com.sandesh.collectionApp;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class MapDemo {
    public static void main(String[] args) {
        //Order is Not preserved
        HashMap<String,Integer> courses = new HashMap<>();
        courses.put("CoreJava",4000);
        courses.put("BasicPython",3500);
        courses.put("Spring",8000);
        courses.put("Android",4000);
        courses.put("Android",4000);
        courses.put("php",2000);


        System.out.println(courses);
        courses.forEach((key,value)->{      //e1 is key and e2 is value
            System.out.println(key+"=>"+value);
        });

        //entry set
        //key set
        System.out.println(courses.get("CoreJava"));
    }
}
