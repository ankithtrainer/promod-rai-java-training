package com.mits.java.designpattern;

public class TestSingleTonClass {

    public static void main(String[] args) {



        SingleTonClass object  = SingleTonClass.getInstance();

        System.out.println( " Object "+ object);

        SingleTonClass object1  = SingleTonClass.getInstance();

        System.out.println( " Object "+ object1);


    }
}
