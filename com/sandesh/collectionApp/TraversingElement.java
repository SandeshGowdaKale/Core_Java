package com.sandesh.collectionApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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

        //BackWard Traversal of collection
        System.out.println("----------------------------------------------");
       ListIterator<String> litr =arrayList.listIterator(arrayList.size());
        while (litr.hasPrevious()){
            String previous = litr.previous();
            System.out.println(previous);
        }

        //Enumeration
        System.out.println("-------------For Each Method--------------------------------");
        arrayList.forEach(e->{
            System.out.println(e);
        });
    }
}
