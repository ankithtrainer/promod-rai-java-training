package com.mits.java.flowcontrol;

import java.util.Scanner;

public class JavaSwitchCaseDemo {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println(  " Enter Trafic Signal Type ");

        String signalType = scan.nextLine();

        switch(signalType){
            case "Red":
                System.out.println( " You are not allowded to go !! ");
                break;
            case "Yellow":
                System.out.println( " Move but with caution !!");
                break;
            case "Green":
                System.out.println( " You are completely Ok to Move");
                break;
            default:
                System.out.println( " Icorrect Signal Type");
        }




    }

}
