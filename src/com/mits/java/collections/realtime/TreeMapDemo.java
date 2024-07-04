package com.mits.java.collections.realtime;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> treeMap  = new TreeMap<>(Collections.reverseOrder());

        treeMap.put(100,"Promod");
        treeMap.put(200,"Alok");
        treeMap.put(300,"Sunita");
        treeMap.put(400,"Puja");

        // Using Lamda Function
        System.out.println( " Using Lamda Function :");
        treeMap.forEach((rollNo, name) -> {
            System.out.println("User ID: " + rollNo + ", " + name);
        });

    }

}
