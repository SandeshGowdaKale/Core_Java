package com.sandesh.collectionApp;

import java.util.ArrayList;
import java.util.Iterator;

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
            System.out.print(listNames + "\t" + listNames.length()+"\t");
            StringBuffer stringBuffer = new StringBuffer(listNames);
            System.out.println(stringBuffer.reverse());
        }
        System.out.println("-------------------------------------------");

        //Traversing Using Itertor: Forward Traversing

        Iterator<String> itr=arrayList.iterator();

        while (itr.hasNext()){
            String next =itr.next();
            System.out.println(next);
        }
    }
}
