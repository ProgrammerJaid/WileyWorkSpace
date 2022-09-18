package com.dayAssignment;

public class DepositAmountException extends Exception {

	public DepositAmountException() {
		super("Amount passed in the calculateTotalInterest is not positive");
	}

	public DepositAmountException(String msg) {
		super(msg);
	}
	
	
}
