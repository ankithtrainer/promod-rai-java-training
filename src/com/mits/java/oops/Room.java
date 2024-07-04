package com.mits.java.oops;

public class Room {

    int radius;

    float length;

    float width;



    Room(int radius){
      System.out.println(" Area Of Circle : " + (3.14 * radius * radius));
    }

    Room(float length){
        this.length = length;
        System.out.println(" Area Of Square " + this.length* this.length);
    }


    Room(float length , float width){
        this.length = length;
        this.width = width;

        System.out.println(" Area Of Square " + this.length* this.width);
    }




   /* double areaOfCircle(){
        return 3.14 * this.radius* this.radius;
    }

    double areaOfSquare(){
        return  this.length* this.length;
    }


    double areaOfRectangle(){
        return  this.length* this.length;
    }


   */
    public static void main(String[] args) {

        Room room = new Room(10);
       // System.out.println( " Area Of Circle : "+ room.areaOfCircle() );


        Room room1 = new Room(5.0F);
       // System.out.println( " Area Of Circle : "+ room1.areaOfSquare() );



        Room room2 = new Room(5.0F , 7.0F);
       // System.out.println( " Area Of Circle : "+ room1.areaOfRectangle() );



    }
}
