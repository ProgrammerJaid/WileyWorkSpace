
public class BankAccountType extends BankAccount {

	private AccountType accType;
	
	public BankAccountType(long accountId, double openingBal,AccountType accType) {
		super(accountId, openingBal);
		if(openingBal<accType.getMinimumBalance())
			this.openingBal = -1;
		this.accType=accType;
	}
	
	@Override
	public void depositAmount(double amount) {
		super.depositAmount(amount);
	}
	
	@Override
	public void withDrawAmount(double amount) {
		double amountLeft = this.currentBal-amount;
		if(this.openingBal!=-1 && amountLeft<accType.getMinimumBalance())
			System.out.println("\n Sorry your minimum balance is reached.\n");
		else
			super.withDrawAmount(amount);
	}
	
}
