package com.mits.java.collections.realtime;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String>  hasSet = new HashSet<>();

        hasSet.add("Promod");
        hasSet.add("Alok");
        hasSet.add("Promod");
        hasSet.add("Alok");
        hasSet.add("Robert");
        hasSet.add("Monica");

        System.out.println( " Using For Each Loop");
        for(String str: hasSet){
            System.out.println( " Value :  " + str );
        }

       //Using Lamda Function
        System.out.println( " Using Lamda Function");
        hasSet.forEach(p -> System.out.println( " Value : "+ p));

    }
}
