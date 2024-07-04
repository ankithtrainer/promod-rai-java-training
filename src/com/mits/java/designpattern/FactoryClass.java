package com.mits.java.designpattern;
//https://dev.to/abh1navv/factory-pattern-in-a-nutshell-2cif

public class FactoryClass {

    public Person getFactory(String gender){
        Person  p  = null;
        if (gender.equals("M")){
            p = new Male();

        }else{
             p = new Female();
        }
        return p;
    }

    public static void main(String[] args) {

        FactoryClass factoryClass = new FactoryClass();

        Person person = factoryClass.getFactory("M");
        person.display();

        if(person instanceof Male) {
            System.out.println(" Male class object");
        }

        Person person1 = factoryClass.getFactory("F");

        if(person1 instanceof Female) {
            System.out.println(" Female class object");
        }



    }
}
