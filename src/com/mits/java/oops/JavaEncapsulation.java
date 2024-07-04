package com.mits.java.oops;

import java.util.Scanner;

public class JavaEncapsulation {

    //  P = Polymorphism
    //  I = Inheritance
    //  E= Encapsulation

    public static void main(String[] args) {
        EmployeeObject  employee = new EmployeeObject();

        Scanner scan  = new Scanner(System.in);

        System.out.println( " Enter Your Name ");
        employee.setEmpName(scan.nextLine());

        System.out.println( " Enter Your Age ");
        employee.setEmpAge(scan.nextInt());
        scan.nextLine();

        System.out.println( " Enter Your Email ");
        employee.setEmpEmail(scan.nextLine());


        System.out.println( " Enter Your Salary ");
        employee.setEmpSalary(scan.nextDouble());
        scan.nextLine();

        System.out.println( " Enter Your Emp Id ");
        employee.setEmpId(scan.nextInt());


        System.out.println( " Emap Name : "+ employee.getEmpName());
        System.out.println( " Emap EmpId : "+ employee.getEmpId());
        System.out.println( " Emap Age : "+ employee.getEmpAge());
        System.out.println( " Emap Salary : "+ employee.getEmpSalary());
        System.out.println( " Emap Email : "+ employee.getEmpEmail());


    }


}
