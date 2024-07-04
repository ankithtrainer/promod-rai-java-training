package com.mits.java.collections.realtime;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> hashMap  = new LinkedHashMap<>();

        hashMap.put(400,"Promod");
        hashMap.put(200,"Alok");
        hashMap.put(300,"Sunita");
        hashMap.put(100,"Puja");

        // Using Lamda Function
        System.out.println( " Using Lamda Function :");
        hashMap.forEach((rollNo, name) -> {
            System.out.println("User ID: " + rollNo + ", " + name);
        });

    }
}
