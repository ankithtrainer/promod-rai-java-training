package com.mits.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelectQuery {
    public static void main(String[] args) {

        Connection conn  = null;

        PreparedStatement pstmt = null;

        ResultSet rs = null;

        String dbUrl = "jdbc:mysql://localhost:3306/employee_management_system?useSSL=false";
        String dbUser = "root";
        String dbPassword ="rootroot";


        try{
            // Steps -1 : Load The Driver - Dynamic Loading
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Steps -2 : Established Connection
            conn = DriverManager.getConnection(dbUrl,dbUser,dbPassword);

            String sqlQuery  = "select * from employees";

            pstmt = conn.prepareStatement(sqlQuery);

            rs =  pstmt.executeQuery();

            while(rs.next()){
                System.out.println( " Emp Id "+ rs.getInt("emp_id"));
                System.out.println( " Email Email "+ rs.getString("email_id"));
                System.out.println( " First Name " + rs.getString("first_name"));
                System.out.println(  " Last Name "+ rs.getString( "last_name"));
                System.out.println( " -------------------------------------------------------");
            }



        }catch(Exception exception){
            System.out.println( " Message :  "+ exception.getMessage());
            exception.printStackTrace();
        }
        finally{
            try {

                conn.close();
                pstmt.close();
                rs.close();
            }catch(Exception e){

            }
        }
    }
}
