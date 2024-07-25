package com.mits.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCImplementations {

    public static void main(String[] args) {

        Connection conn  = null;

        try{
            // Steps -1 : Load The Driver - Dynamic Loading
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Steps -2 : Established Connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system?user=root&password=rootroot");

            if(conn!=null){
                System.out.println( " Connection found");
            }else {
                System.out.println( " Connection  Not Found ");
            }


        }catch(Exception exception){
            System.out.println( " Message :  "+ exception.getMessage());
            exception.printStackTrace();
        }



    }

}
