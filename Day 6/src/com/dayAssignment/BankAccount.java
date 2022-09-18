package com.dayAssignment;

public class BankAccount {

	private long accountId;
	private String accountHolderName;
	private AccountType accType;

	public BankAccount(long accountId, String accountHolderName, AccountType accType) {
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accType = accType;
	}

	public void calculateTotalInterest(double amount, int yr)  throws DepositAmountException {

		double interest = ((amount * yr * accType.getInterestRate()) / 100);
		System.out.printf("Your %s account with amount %.2f for %d years for interest rate @%.2f is: %.2f.\n",
				accType.toString(), amount,yr,accType.getInterestRate(),interest);
	}

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accType="
				+ accType + "]";
	}

}
