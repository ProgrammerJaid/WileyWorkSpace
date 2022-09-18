package com.dayAssignment;

public class BankAccountType extends BankAccount {

	public BankAccountType(long accountId, String accountHolderName, AccountType accType) {
		super(accountId, accountHolderName, accType);
	}

	@Override
	public void calculateTotalInterest(double amount, int yr) throws DepositAmountException {
		if(amount<0)
			throw new DepositAmountException();
		super.calculateTotalInterest(amount, yr);
	}
	
	

}
