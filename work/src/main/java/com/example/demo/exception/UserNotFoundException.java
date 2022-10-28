package com.example.demo.exception;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public UserNotFoundException(String msg) {
		super(msg);
	}

	public String getMsg() {
		return msg;
	}
	
}
