package com.database_work;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/employee_directory";
	private static final String USER = "employees";
	private static final String PASSWORD = "mypassword";
	//private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	private static void getEmployees() {
		
		Connection 	myConn = null;
		Statement 	myStmt = null;
		ResultSet 		rs = null;
		String query = "SELECT * FROM employee";
		try {
			//Class.forName(DRIVER);
			myConn = DriverManager.getConnection(DB_URL,USER,PASSWORD);
			myStmt = myConn.createStatement();
			rs= myStmt.executeQuery(query);
			while(rs.next())
				System.out.println(rs.getString(2)+" "+rs.getString(3));
			//System.out.println("Sucessfull.");
		}
		catch(SQLException e) { //ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				close(myConn,myStmt,rs);
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		getEmployees();
	}

	private static void close(Connection myConn, Statement myStmt, ResultSet myRs) throws SQLException {
		if(myRs!=null)
			myRs.close();
		if(myStmt!=null)
			myStmt.close();
		if(myConn!=null)
			myConn.close();
	}
}
