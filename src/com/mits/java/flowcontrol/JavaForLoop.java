package com.mits.java.flowcontrol;

import java.util.Scanner;

public class JavaForLoop {

    // While loop
    // do while loop
    // for loop

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in) ;
        System.out.println( " Enter Number ");
        int num  = scan.nextInt();

        int sum  = 0;

       for(int i=0; i<=num ; i++){
            sum  = sum + i;
            System.out.println( " i  = " + i + " Sum = "+ sum);
        }
        System.out.println( " Total Value : "+ sum);



    }
}
