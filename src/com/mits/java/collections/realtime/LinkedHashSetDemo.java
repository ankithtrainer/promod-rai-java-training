package com.mits.java.collections.realtime;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> hasSet = new LinkedHashSet<>();

        hasSet.add("Promod");
        hasSet.add("Alok");
        hasSet.add("Promod");
        hasSet.add("Alok");
        hasSet.add("Robert");
        hasSet.add("Monica");


        //Using Lamda Function
        System.out.println( " Using Lamda Function");
        hasSet.forEach(p -> System.out.println( " Value : "+ p));

    }
}
