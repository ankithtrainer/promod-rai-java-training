package com.mits.java.exception;

public class MyExceptionDemo {

    public static void main(String[] args) {
       try {
           int x = 10;

           int y = 0;

           int z = x / y;

           System.out.println(" Z = " + z);

       }catch(Exception abcd){
           System.out.println( " Message : "+ abcd.getMessage());
           //exception.printStackTrace();
       }

    }




}
