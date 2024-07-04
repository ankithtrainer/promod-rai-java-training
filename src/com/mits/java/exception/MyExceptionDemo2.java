package com.mits.java.exception;

public class MyExceptionDemo2 {
    public static void main(String[] args) {
       try {
           String[] str = new String[3];

           str[0] = " Promod";
           str[1] = "Alok";
           str[2] = "Moumita";
           str[3] = "Kate";

           for (String st : str) {
               System.out.println(" Name = > " + st);
           }
       }catch(Exception exception){
           System.out.println( "  Message = > "+ exception.getMessage());
           //exception.printStackTrace();
       }

    }
}
