package com.mits.java.collections.realtime;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap  = new HashMap<>();

        hashMap.put(100,"Promod");
        hashMap.put(200,"Alok");
        hashMap.put(300,"Sunita");
        hashMap.put(400,"Puja");
        // For Each
        System.out.println( " Using For Each Function");
        for(Map.Entry<Integer,String>  entryset: hashMap.entrySet() ){
            System.out.println(  " Key => " + entryset.getKey()  + " Value => " + entryset.getValue());
        }

        // Using Lamda Function
        System.out.println( " Using Lamda Function :");
        hashMap.forEach((rollNo, name) -> {
            System.out.println("User ID: " + rollNo + ", " + name);
        });

    }
}
