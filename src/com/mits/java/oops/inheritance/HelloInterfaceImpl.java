package com.mits.java.oops.inheritance;

public class HelloInterfaceImpl extends  HelloAbstractClass{

    public void display(){  // Fully defined method
        System.out.println( " This is display method");
    }

    public void show(){
        System.out.println( " This is show Method ");
    }

    public void showUpMe(){
        System.out.println( " This is Show Up method");
    }



    public static void main(String[] args) {
        HelloInterfaceImpl helloInterface  = new HelloInterfaceImpl();
        helloInterface.show();
        helloInterface.display();
        helloInterface.showUpMe();

        //this is my GitHub https://github.com/raipramod

        //7209214936 my number

    }
}
