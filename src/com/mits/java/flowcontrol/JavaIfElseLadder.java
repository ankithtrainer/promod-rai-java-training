package com.mits.java.flowcontrol;

import java.util.Scanner;

public class JavaIfElseLadder {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println(  " Enter Your Marks ");

        int marks = scan.nextInt();

        if(marks>80){
            System.out.println( " Your Grade is A");
        }else if(marks>60 && marks <80){
            System.out.println( " Your Grade is B");
        }else if(marks>40 && marks <60){
            System.out.println( " Your Grade is B");
        }else if(marks>30 && marks <40){
            System.out.println( " Your Grade is C");
        }else{
            System.out.println( " Your are fail");
        }


    }
}
