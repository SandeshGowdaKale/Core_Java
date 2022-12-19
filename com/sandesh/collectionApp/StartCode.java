package com.sandesh.collectionApp;

import java.util.ArrayList;
import java.util.Vector;

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

        //remove   //note one Object is removed not both eg "vanada"
        names.remove("vandna");
        System.out.println(names);

        //Size
     System.out.println("SIZE :: "+names.size());

     //impilicity it calling string class equals method for checking
     //if student custom object than we have to override equals method
     System.out.println(names.contains("sandesh"));
    //update the element
     names.set(1,"Dimple");
     System.out.println(names);

     //add another element in between  //not good practice it takes time reason shift operation.
     //Arraylist is Good for fetch the element(note array is faster than Arraylist)
     names.add(1,"Ram");
     System.out.println(names);
/*
     All elements will be clear empty []
     names.clear();
     System.out.println(names);*/

     //System.out.println(names.get(2));

/*        //nON-Type Safe()
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("sachin");
        list.add(true);
        list.add(12.0f);
        list.add(22.22);
        System.out.println(list);*/

     System.out.println("-------------Vector Class introduced in 1.0 legacy Class----------------------");
     Vector<String> vector = new Vector<>();
     vector.addAll(names);
     System.out.println("VECTOR::"+names);

    }
}
