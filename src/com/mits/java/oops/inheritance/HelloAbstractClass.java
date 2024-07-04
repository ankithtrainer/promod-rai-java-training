package com.mits.java.oops.inheritance;

public abstract class HelloAbstractClass implements HelloInterface {


    public void display(){  // defined method
        System.out.println(  " This is abstract class");
    }

    public abstract void showUpMe();  // abstract method

}
