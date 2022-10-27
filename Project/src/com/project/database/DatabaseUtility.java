package com.project.database;

public class DatabaseUtility {

	public static boolean insertCustomer(String s){
		
		
			if(s.equals("Salasa"))
					throw new DanceException("Salsa not available.");

		return true;
	}
	
	public static void main(String[] args) {
		try {
			insertCustomer("Salasa");
		} catch (DanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
