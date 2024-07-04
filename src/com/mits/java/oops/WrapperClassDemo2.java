package com.mits.java.oops;

public class WrapperClassDemo2 {
    public static void main(String[] args) {
        // int --> Integer --> String

        // String -- > Integer --> int

        int x =10;

        // int --> INteger
        Integer x1  = x ; // Int to integer using Autoboxing  //  Integer x  = new Integer(x);

        // Integer to String
        String x2 = x1.toString();

        System.out.println( " X 2 = > " + x2);



        String y = "100";

        // String to Integer Object
        Integer Y1 = Integer.valueOf(y);

        // Integer to int

        int y2 = Y1.intValue();

        System.out.println( " y3 : "+ y2);


        //  We can cmbine in a single steps using below  = >  String  ===>  int

        int y3 = Integer.parseInt(y);

        System.out.println( " Y3 : " + y3);

        String str = "Promod Rai";

      //  Integer.parseInt(str);

    }
}
