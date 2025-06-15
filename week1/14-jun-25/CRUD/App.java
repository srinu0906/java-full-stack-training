package com.srinu.crud;

import java.sql.*;
import java.util.*;

public class App {
	
    public static void main(String[] args) {
    	
    		Scanner sc = new Scanner(System.in);
    		
    		String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "system";       
            String password = "srinu";

            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection conn = DriverManager.getConnection(url, user, password);
                while(true) {
                	System.out.println("\n1. Insert Student");
                	System.out.println("2. View all Students");
                	System.out.println("3. Update Student");
                	System.out.println("4. Delete Student");
                	System.out.println("5. Exit");
                	
                	System.out.println("Enter your choice:");
                	int choice = sc.nextInt();
                	
                	switch(choice) {
                	
                		case 1 :{
                			
                			System.out.println("Enter Student ID");
                			int id = sc.nextInt();
                			sc.nextLine();
                			System.out.println("Enter Student Name");
                			String name = sc.nextLine();
                			System.out.println("Enter Student Age");
                			int age = sc.nextInt();
                			sc.nextLine();
                			System.out.println("Enter Student Email");
                			String mail = sc.nextLine();
                			
                			String query = "insert into students values(?,?,?,?)";
                			PreparedStatement ppst = conn.prepareStatement(query);
                			ppst.setInt(1, id);
                			ppst.setString(2, name);
                			ppst.setInt(3,age);
                			ppst.setString(4,mail);
                			
                			ppst.executeUpdate();
                			System.out.println("Row inserted");
                			break;
                			
                		}
                		
                		
                		case 2: {
                			String query = "Select * from students";
                			Statement st = conn.createStatement();
                			ResultSet rs = st.executeQuery(query);
                			System.out.println("\nID\tName\tAge\tEmail");

                			while(rs.next()) {
                				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
                			}
                			break;
                		}
                		
                		
                		case 3 :{
                			System.out.println("Enter Student Id to update");
                			int id = sc.nextInt();
                			sc.nextLine();
                			System.out.println("Enter new Student Name");
                			String name = sc.nextLine();
                			System.out.println("Enter new Student Age");
                			int age = sc.nextInt();
                			sc.nextLine();
                			System.out.println("Enter new Student Email");
                			String mail = sc.nextLine();
                			
                			String query = "update students set name = ?,age = ?, email =? where id = ?";
                			PreparedStatement ppst = conn.prepareStatement(query);
                			ppst.setString(1, name);
                			ppst.setInt(2, age);
                			ppst.setString(3, mail);
                			ppst.setInt(4, id);
                			
                			ppst.executeUpdate();
                			
                			System.out.println("Row updated");
                			break;
                			
                		}
                		
                		
                		case 4 :{
                			
                			System.out.println("Enter Student Id to delete");
                			int id = sc.nextInt();
                			
                			String query = "delete from Students where id = ?";
                			PreparedStatement ppst = conn.prepareStatement(query);
                			ppst.setInt(1, id);
                			ppst.executeUpdate();
                			
                			System.out.println("Row deleted");
                			break;
                			
                		}
                		
                		case 5:{
                			System.out.println("Exiting...");
                			conn.close();
                			sc.close();
                			System.exit(0);
                		}
                		
                		default :{
                			System.out.println("Enter valid choice");
                		}
                	
                	}
                	
                }
                
            }
            
            catch (Exception e) {
                e.printStackTrace();
            }
        
    }
}

