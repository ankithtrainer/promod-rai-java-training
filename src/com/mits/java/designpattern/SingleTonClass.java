package com.mits.java.designpattern;

public class SingleTonClass {

    private SingleTonClass(){

    }

    private static SingleTonClass object = new SingleTonClass();

    public static SingleTonClass getInstance(){

        return object;
    }

}
