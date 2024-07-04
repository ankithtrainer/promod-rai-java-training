package com.mits.java.arrays;

public class ArraysDemo {

    public static void main(String[] args) {

       // int[]  numbers = {10,20,30};

        int[] numbers  = new int[3];
        numbers[0] =10;
        numbers[1] =20;
        numbers[2] =30;

        for(int i=0; i<numbers.length ;i++){
            System.out.println( " i = "+ numbers[i]);
        }

        // ForEach Loop or Enhanced For Loop

        for(int x: numbers){
            System.out.println( " i = "+ x);
        }


        //String[]  str  = { "Promod" , " Alok" ,"Puja"};
        String[] str  = new String[3];
        str[0] = "Promod";
        str[1] = "Alok";
        str[2] = "Puja";

        for(int i=0; i<str.length ;i++){
            System.out.println( " I = "+ str[i]);
        }

        // ForEach Loop or Enhanced For Loop
        for(String st: str){
            System.out.println( " Value= "+ st);
        }



    }
}
