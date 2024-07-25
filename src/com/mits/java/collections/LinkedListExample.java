package com.mits.java.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> mylist = new LinkedList<String>(); // Ordered List

        mylist.add("Alok");

        mylist.add(" Promod");
        mylist.addFirst("Mounika");
        mylist.addLast("Ratan");
        mylist.removeFirst();

        for(String value: mylist){
            System.out.println( "  Value  =>  "+ value);
        }

    }
}
