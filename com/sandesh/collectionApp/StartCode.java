package com.sandesh.collectionApp;

import java.util.ArrayList;

public class StartCode {
    public static void main(String[] args) {
       new ArrayList<>();

       /*
       Creating Collection
       1)Type Safe ->same type of element or Object Added
       2)nON-Type Safe -> Different types of object can be added to Collection
        */

        //Type Safe collection

        ArrayList<String> names = new ArrayList<String>();  //order is preserve & duplicates are allowed
        names.add("sandesh");
        names.add("sitara");
        names.add("Roshni");
        names.add("vandna");
        names.add("vandna");

        System.out.println(names);
        System.out.println(names.get(2));

        //nON-Type Safe()
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("sachin");
        list.add(true);
        list.add(12.0f);
        list.add(22.22);
        System.out.println(list);
    }
}
