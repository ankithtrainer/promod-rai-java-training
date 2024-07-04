package com.mits.java.oops;

import java.util.ArrayList;

public class WrapperClassDemo {
    public static void main(String[] args) {

        //  int  -- > Integer
        //  double --> Double
        //  float  -->  Float
        //  byte   --->  Byte
        // char    --->  Character
        // long    ----> Long
        // short    ----> Short

        int x = 10;

         ArrayList<Integer>  list  = new ArrayList<Integer>();

        System.out.println( " X : "+ x);  // Primitive Value

        // Integer x = new Integer(x);  // Java OLd version  converting primitive to object

        Integer x1 = x;  // Autoboxing --->  Primitive to Object Type
        int x2 = x1;  // x1.intValue()  // Outboxing / Unboxing  --> Object or Wrappertype to primnitive

        System.out.println( " X : "+ x1);  // Interger Object  Value


        int y =20;
        double z= 30.5D;

        // int to Integer
        Integer  y1 = Integer.valueOf(y);  //  y is primitive and Y1 is an object

        Double z1  = Double.valueOf(z); // double primitive to double object


        //  INteger to int primitive

        int  y2 = y1.intValue(); /// Integer object to int primitive type
        double z2 = z1.doubleValue();  // Double object to double primitive type

    }
}
