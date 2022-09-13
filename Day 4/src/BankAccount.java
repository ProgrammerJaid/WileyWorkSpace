
public class BankAccount {

	private long accountId;
	protected double openingBal,currentBal;
	private static double totalBal;

	public BankAccount(long accountId, double openingBal) {
		if(openingBal<=0)	this.openingBal=-1;
		else {
			this.accountId = accountId;	
			this.openingBal = openingBal;
			this.currentBal = openingBal;
			totalBal+=openingBal;
		}
	}
	
	public void depositAmount(double amount) {
		if(openingBal==-1)
			System.out.print("\n Account does not exists.");
		else {
			totalBal+=amount;
			this.currentBal+=amount;
			printBalance();
		}
	}
	
	public void withDrawAmount(double amount) {
		if(this.openingBal==-1)
			System.out.print("\n Account does not exists.");
		else {
			if(amount<=totalBal && amount<=currentBal) {
				totalBal-=amount;
				this.currentBal-=amount;
				printBalance();
			}
			else if(currentBal<amount) {
				System.out.print("\n Insufficient balance. ");
				printBalance();
			}
			else 
				System.out.println("\n Not enough balance now, please try again later.");
		}
	}
	
	public void printBalance() {
		System.out.printf("\n The current balance at your account %d is ->  %.4f",accountId,currentBal);
	}
}
