package com.dayAssignment;

public class InvalidEmailException extends Exception{

	public InvalidEmailException() {
		super("Invalid email format.");
	}

	public InvalidEmailException(String msg) {
		super(msg);
	}
	
}
