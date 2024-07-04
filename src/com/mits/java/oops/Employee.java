package com.mits.java.oops;

import java.util.Scanner;

public class Employee {
    private String empName;
    private int empId;
    private int empAge;
    private String empEmail;
    private double empSalary;

    public void displayEmpInfo(){
        System.out.println( " Emap Name : "+ empName);
        System.out.println( " Emap EmpId : "+ empId);
        System.out.println( " Emap Age : "+ empAge);
        System.out.println( " Emap Salary : "+ empSalary);
        System.out.println( " Emap Email : "+ empEmail);

    }

    public static void main(String[] args) {
        Employee  employee = new Employee();

        Scanner scan  = new Scanner(System.in);

        System.out.println( " Enter Your Name ");
        employee.empName = scan.nextLine();

        System.out.println( " Enter Your Age ");
        employee.empAge= scan.nextInt();
        scan.nextLine();

        System.out.println( " Enter Your Email ");
        employee.empEmail = scan.nextLine();


        System.out.println( " Enter Your Salary ");
        employee.empSalary = scan.nextDouble();
        scan.nextLine();

        System.out.println( " Enter Your Emp Id ");
        employee.empId = scan.nextInt();


        employee.displayEmpInfo();



    }



}
