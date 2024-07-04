package com.mits.java.collections.realtime;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class HashTable {
    public static void main(String[] args) {

        Hashtable<Integer,String> hashTable  = new Hashtable<>();

        hashTable.put(100,"Promod");
        hashTable.put(200,"Alok");
        hashTable.put(300,"Sunita");
        hashTable.put(400,"Puja");

        // Using Lamda Function
        System.out.println( " Using Lamda Function :");
        hashTable.forEach((rollNo, name) -> {
            System.out.println("User ID: " + rollNo + ", " + name);
        });

        // HashMap is not threadshape hence performance is facter  but HashTable is threadshape hence performance is slower

    }
}
