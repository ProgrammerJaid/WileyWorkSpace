package com.presentation.exception;

public class InvalidCustomerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCustomerException(String msg){
		super(msg);
	}
	
	InvalidCustomerException(){
		super(" Invalid Customer Details.");
	}
}
