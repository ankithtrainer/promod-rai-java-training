package com.mits.java.oops;

/**
 *  Java Constructor Program
 */
public class HelloConstructor {
  // Constructor name is same as ClassName
    HelloConstructor(){            // Constructor Without Parameter

        System.out.println(  "  This is No Parameter Constructor");

    }

    HelloConstructor(int x,int y){          // Parameterrized Constructor

        System.out.println(  "  This is Two Parameterized Constructor");
        System.out.println(  " X : "+ x + " Y : "+ y);

    }


    HelloConstructor(int i, int j, float k){    // Parameterrized Constructor

        System.out.println(  "  This is Multi  Parameterized Constructor");
        System.out.println(  " I: "+ i + " J : "+ j + " K "+ k);
    }

    public static void main(String[] args) {

        HelloConstructor helloConstructor1  = new HelloConstructor(); // Constructor Always returns Object

        HelloConstructor helloConstructor2  = new HelloConstructor(10,20);

        HelloConstructor helloConstructor3  = new HelloConstructor(5, 10 , 7.0F);


    }



}
