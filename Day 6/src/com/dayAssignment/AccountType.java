package com.dayAssignment;

public enum AccountType {

	SAVINGS(6.0),CURRENT(8.5);
	
	private double interestRate;

	private AccountType(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
}
