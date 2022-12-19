package com.sandesh.collectionApp;

import java.util.ArrayList;

public class TraversingElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("sandesh");
        arrayList.add("jhon");
        arrayList.add("manju");
        arrayList.add("sanju");
        arrayList.add("sanju");

        //for each loop
        for(String listNames:arrayList){
            System.out.println(listNames);
        }
    }
}
