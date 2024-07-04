package com.mits.java.oops;

import java.util.Scanner;

public class EmployeesDataHandler {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println( " How Many Employee Data You want to take as Input ?");

        int empCount = scan.nextInt();


        EmployeeObject[]  emp= new EmployeeObject[empCount];

        for(int i=0; i< emp.length;i++){
            EmployeeObject  employee =  new EmployeeObject();

            System.out.println(" Enter Your Name ");
            scan.nextLine();
            employee.setEmpName(scan.nextLine());

            scan.nextLine();
            System.out.println(" Enter Your Age ");
            employee.setEmpAge(scan.nextInt());
            scan.nextLine();

            System.out.println(" Enter Your Email ");
            employee.setEmpEmail(scan.nextLine());
            scan.nextLine();


            System.out.println(" Enter Your Salary ");
            employee.setEmpSalary(scan.nextDouble());
            scan.nextLine();

            System.out.println(" Enter Your Emp Id ");
            employee.setEmpId(scan.nextInt());

            emp[i] = employee;



        }


        for(EmployeeObject  employee: emp) {

            System.out.println(" Emp EmpId : " + employee.getEmpId());
            System.out.println(" Emp Age : " + employee.getEmpAge());
            System.out.println(" Emp Salary : " + employee.getEmpSalary());
            System.out.println(" Emp Email : " + employee.getEmpEmail());
            System.out.println(" Emp Name : " + employee.getEmpName());

            System.out.println( " ----------------------------------------------------------");
            System.out.println();
        }



    }




}
