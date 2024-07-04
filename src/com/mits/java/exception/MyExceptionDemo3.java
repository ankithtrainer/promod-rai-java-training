package com.mits.java.exception;

import com.sun.jdi.IntegerType;

public class MyExceptionDemo3 {

    public static void main(String[] args) {

        try {
            int[] arr = new int[3];

            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;

            arr[3] = 40;

            int z = 0;

            int value = (arr[0] + arr[1] + arr[2]) / z;

            System.out.println(" value : " + value);
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println(  " Message :  "+ exception);
        }catch (ArithmeticException exception){
            System.out.println(  " Message : =>  "+ exception.getMessage());
        }

        catch(Exception exception){
            System.out.println(  " Message : = > "+ exception.getMessage());
        }


    }
}
