package com.sandesh.collectionApp;

import java.util.HashSet;
import java.util.TreeSet;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        //Set Interface order is not preserved & duplicates are not allowed

        HashSet<Double> doubleHashSet= new HashSet<>();
        doubleHashSet.add(1.1);
        doubleHashSet.add(1.1);  //There is no exception//not allowed
        doubleHashSet.add(1.2);//AutoBoxed and Auto Unboxing implicitly
        doubleHashSet.add(new Double(1.3));
        System.out.println(doubleHashSet);
        TreeSet<Double> treeSet = new TreeSet<>();
        treeSet.addAll(doubleHashSet);
        System.out.println(treeSet);

    }
}
