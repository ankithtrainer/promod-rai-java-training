package com.mits.java.collections.realtime;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
         Set<String> treeset =  new TreeSet<>(Collections.reverseOrder() );
        treeset.add("Promod");
        treeset.add("Alok");
        treeset.add("Mounica");
        treeset.add("Bulbul");

        treeset.forEach(str -> System.out.println(str));

    }
}
