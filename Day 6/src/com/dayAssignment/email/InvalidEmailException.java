package com.dayAssignment.email;

public class InvalidEmailException extends Exception{

	public InvalidEmailException() {
		super("Invalid email format.");
	}

	public InvalidEmailException(String msg) {
		super(msg);
	}
	
}
