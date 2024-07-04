package com.mits.java.collections.realtime;

import java.util.HashSet;

public class HashSetObjectDemo {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setEmpId(100);
        employee1.setEmpName( "Promod");
        employee1.setEmail("promod@gmail.com");

        System.out.println( "Object Address : "+ employee1 );

        Employee employee2 = new Employee();

        employee2.setEmpId(100);
        employee2.setEmpName( "Promod");
        employee2.setEmail("promod@gmail.com");
        System.out.println( "Object Address : "+ employee2 );

        Employee employee3 = new Employee();

        employee3.setEmpId(101);
        employee3.setEmpName( "Alok");
        employee3.setEmail("alok@gmail.com");

        System.out.println( "Object Address : "+ employee3 );
        Employee employee4 = new Employee();

        employee4.setEmpId(101);
        employee4.setEmpName( "Alok");
        employee4.setEmail("alok@gmail.com");

        System.out.println( "Object Address : "+ employee4 );

        Employee employee5 = new Employee();

        employee5.setEmpId(102);
        employee5.setEmpName( "Robert");
        employee5.setEmail("robert@gmail.com");

        System.out.println( "Object Address : "+ employee5);

        Employee employee6 = new Employee();

        employee6.setEmpId(103);
        employee6.setEmpName( "Mounica");
        employee6.setEmail("mounica@gmail.com");

        System.out.println( "Object Address : "+ employee6 );

        HashSet<Employee> employeeHashSet = new HashSet<>();

        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);



        for(Employee employee : employeeHashSet){
            System.out.println( " Employee Id : => " + employee.getEmpId());
            System.out.println( " Employee Name :=> " + employee.getEmpName());
            System.out.println( " Employee Email :=> " + employee.getEmail());
            System.out.println( " ---------------------------------------------");

        }

    }



}
