package com.mits.java.oops;

public class JavaProgramWithoutConstructor {

    JavaProgramWithoutConstructor(){

    }

    public double areaOfCircle(int x){
        return  3.14 *x *x; //

    }

   public int  areaOfSquare( int length , int width){
        return length*width;
   }

   public int areaOfRectangle( int length , int breadth){
        return length*breadth;
   }


    public static void main(String[] args) {

        JavaProgramWithoutConstructor  javaProgramWithoutConstructor = new JavaProgramWithoutConstructor();

       double areaOfCircle = javaProgramWithoutConstructor.areaOfCircle(10);

        System.out.println( " Area Of Circle : " + areaOfCircle);

        // Area of a Square

        int areaOfSquare  = javaProgramWithoutConstructor.areaOfSquare(12 , 12);

        System.out.println( " Area Of Square " + areaOfSquare);

        // Area Of Square
        int areaOfRectangle  = javaProgramWithoutConstructor.areaOfRectangle( 10, 15);
        System.out.println( " Area Of Rectangle  : "+ areaOfRectangle);


    }
}
