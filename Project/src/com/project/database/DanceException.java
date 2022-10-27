package com.project.database;

public class DanceException extends RuntimeException {
	
	private String msg;

	public DanceException(String msg) {
		super(msg);
	}

}
