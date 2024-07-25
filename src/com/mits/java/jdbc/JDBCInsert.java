package com.mits.java.jdbc;

import java.sql.*;

public class JDBCInsert {
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

            String sqlQuery  = "INSERT into employees(emp_id,email_id, first_name, last_name) values (?,?,?,?)";

            pstmt = conn.prepareStatement(sqlQuery);
            pstmt.setInt(1,1001);
            pstmt.setString(2,"alokhalder@gmail.com");
            pstmt.setString(3,"Alok");
            pstmt.setString(4,"Halder");

            int rows =  pstmt.executeUpdate();

            if(rows>0){
                System.out.println(  " Record Inserted ");

            }else{
                System.out.println(  " Record insert  failed ");

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
