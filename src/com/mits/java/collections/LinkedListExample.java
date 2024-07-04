package com.mits.java.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<String> mylist = new LinkedList<String>(); // Ordered List

        mylist.add(" Alok");

        mylist.add(" Promod");

        for(String value: mylist){
            System.out.println( "  Value  =>  "+ value);
        }

    }
}
