package com.mits.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

      /*  int[]  obj = new int[3]; // fixed size

        obj[0] =10;
        obj[2] =10;
        obj[3] =10;
       */

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
       // list.add("Promod");
       // list.add("Alok");

        list.remove(4);
        System.out.println( " List Size : "+ list.size());

        // For Each Loop
        System.out.println( " Using For Each Loop");
        for(Integer x : list){
            System.out.println( " Value => "+ x);
        }

        // Using Lamda Funtion
        System.out.println( " Using Lamda Function ");
        list.forEach( e -> System.out.println(" Value " + e));


    }




}
