package com.srinu.crud;

import java.sql.*;

public class CRUD {
	
    public static void main(String[] args) {
    	
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "system";       
        String password = "srinu";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Oracle XE!");
            conn.close();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}


