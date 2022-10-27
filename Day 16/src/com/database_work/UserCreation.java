package com.database_work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserCreation {

	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/employee_directory";
	private static final String USER = "employees";
	private static final String PASSWORD = "mypassword";
	private static final String query = "INSERT INTO users(user_name,user_password) VALUES (?,?)";
	static final Scanner in = new Scanner(System.in);
	
	public static boolean createTable() {
		
		try(Connection myConn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
				Statement myStmt = myConn.createStatement()){
			
			String checkTable = "SHOW TABLES LIKE 'users'";
			boolean check = myStmt.execute(checkTable);
			if(check)
				return false;
			
			String createTable = "CREATE TABLE users(id INT PRIMARY KEY AUTO_INCREMENT,"
					+ "user_name VARCHAR(20) NOT NULL UNIQUE,user_password VARCHAR(20) NOT NULL)";
			myStmt.execute(createTable);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public static boolean getUser() {
		String[] data = getData();
		checkData(data[0],data[1]);
		return true;
	}
	
	public static void insertIntoTable() {
		
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
				PreparedStatement pState = conn.prepareStatement(query)){
			String[] data = getData();
			pState.setString(1, data[0]);
			pState.setString(2, data[1]);
			
			boolean execute = pState.execute();
			System.out.println(execute);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}
	
	private static void checkData(String userName, String password2){
		
		String checkQ = "SELECT user_name,user_password FROM users WHERE user_name=?";
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
				PreparedStatement pState = conn.prepareStatement(checkQ)){
			
			pState.setString(1, userName);
			
			ResultSet rs= pState.executeQuery();
			if(!rs.next()) {	
				if(askUser())
						insertIntoTable(userName, password2);
			}
			else
				System.out.println("User : "+rs.getString(1)+"-Password: "+rs.getString(2));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean askUser() {
		System.out.print("User does not exists do you wanna add it Y/N");
		String ans = "N";
		try {
			ans= in.nextLine();
		}
		finally {
		in.close();
		}
		if(ans.equalsIgnoreCase("Y"))
			return true;
		return false;
	}
	
	public static void insertIntoTable(String userName,String password) {
		
		try(Connection conn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
				PreparedStatement pState = conn.prepareStatement(query)){
			pState.setString(1, userName);
			pState.setString(2, password);
			
			boolean execute = pState.execute();
			System.out.println(execute);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Done");
	}

	private static String[] getData() {
		System.out.println("\t Enter Username:");
		String userName = in.nextLine();
		System.out.println("\t Enter Password:");
		String password = in.nextLine();
		return new String[] {userName,password};
	}
	
}
