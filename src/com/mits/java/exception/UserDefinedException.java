package com.mits.java.exception;

import java.util.Scanner;

class MyException extends Exception{
    MyException(String message) {
        super(message);
    }
}

public class UserDefinedException  extends MyException{
    UserDefinedException(String message1){
        super(message1);
    }

    public static void main(String[] args) {

        String user = "alokhalder@gmail.com"; // Stored Google database
        String password  = "abcd";  // Stored Google database


        Scanner scan  = new Scanner(System.in);

        System.out.println( " Enter  Your Gmail Id ");

        String screenUserInput  = scan.nextLine();

        System.out.println( " User : " + screenUserInput);


        System.out.println( " Enter  Your Gmail Password ");

        String screenPasswordInput  = scan.nextLine();

        System.out.println( " User : " + screenPasswordInput);

        if(screenUserInput.equals(user)  && screenPasswordInput.equals(password)){
            System.out.println(" Welcome to Gmail Dashboard");

        }else {
             try {
                 throw new UserDefinedException("Wrong password. Try again or click ‘Forgot password’ to reset it");
             }catch(MyException exception) {
                 System.out.println( " Message : " + exception.getMessage());
             }
        }


    }


}
