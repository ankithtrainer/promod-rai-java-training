package com.mits.java.arrays;

public class JavaCopyArrays {

    public static void main(String[] args) {

        String[]  str  = { "Promod" , " Alok" ,"Puja"};

        String[]  myArray = str; //copying arrays

        // ForEach Loop or Enhanced For Loop
        for(String st:myArray){
            System.out.println( " Value= "+ st);
        }
    }

}
