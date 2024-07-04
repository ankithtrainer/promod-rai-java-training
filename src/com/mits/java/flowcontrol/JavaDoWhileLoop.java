package com.mits.java.flowcontrol;

import java.util.Scanner;

public class JavaDoWhileLoop {


    // While loop
    // do while loop
    // for loop

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in) ;

        System.out.println( " Enter Number ");

        int num  = scan.nextInt();

        int sum  = 0;
        int  i =0;
        do{

            sum  = sum + i;
            i = i+1; // i++
            System.out.println( " i  = " + i + " Sum = "+ sum);
        }while(i<=num);
        System.out.println( " Total Value : "+ sum);



    }
}
