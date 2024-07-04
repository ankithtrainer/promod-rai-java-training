package com.mits.java.flowcontrol;

import java.util.Scanner;

public class JavaFlowControl {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

       /* System.out.println( " Enter Season Name ");
        String  season  = scan.nextLine();
        System.out.println( " Length "+ season.length());
        */
        String season = " Rainy    ";
        System.out.println( " Before Trim "+ season.length());
        season.trim();
        System.out.println( " After Trim "+ season.length());

        if (season.equals("Rainy")){
            System.out.println(  " Don't forget to carry Unbrella with You always ");
        }
        else{
            System.out.println( " It is ok not to carry with Unbrella");
        }


    }
}
