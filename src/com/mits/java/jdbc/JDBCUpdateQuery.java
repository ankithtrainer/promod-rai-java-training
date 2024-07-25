package com.mits.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCUpdateQuery {

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

            String sqlQuery  = "update employees set email_id =?, first_name=? , last_name=? where emp_id=?";

            pstmt = conn.prepareStatement(sqlQuery);
            pstmt.setString(1,"promod@gmail.com");
            pstmt.setString(2,"Promod");
            pstmt.setString(3,"Rai");
            pstmt.setInt(4, 1001);

            int rows =  pstmt.executeUpdate();

            if(rows>0){
                System.out.println(  " Record Update ");

            }else{
                System.out.println(  " Record update failed ");

            }



        }catch(Exception exception){
            System.out.println( " Message :  "+ exception.getMessage());
            exception.printStackTrace();
        }
        finally{
            try {

                conn.close();
                pstmt.close();
            }catch(Exception e){

            }
        }
    }
}
