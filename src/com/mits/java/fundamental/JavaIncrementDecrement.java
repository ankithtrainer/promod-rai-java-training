package com.mits.java.fundamental;

public class JavaIncrementDecrement {
    public static void main(String[] args) {
        int i = 0;

        //i = i+1;  // 0+1  = 1
        //i++; // i= i+1;  //increment operator // Post increment
        //System.out.println( " i = "+ (i++)); // Post increment
        System.out.println( " i = "+ (++i)); // Pre increment
        System.out.println( " After increment "+ i);


        int j=1;

       // j = j+1;
       // j  = j-1;
        //System.out.println( " J  =  "+ (j--)); // Post Decrement

        System.out.println( " J = " + (--j));  // Predrement
        System.out.println( " J  = "+ j);


    }
}
