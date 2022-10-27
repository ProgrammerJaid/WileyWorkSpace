package com.database_work;

public class TestClass {

	public static void main(String[] args) {
//		boolean createTable = UserCreation.createTable();
//		System.out.println(createTable);
//		
//		UserCreation.insertIntoTable();
		System.out.println(getUsers());
		//defaultMethod();
	}
	
	private static boolean getUsers() {
		UserCreation.getUser();
		return true;
	}
	
}
