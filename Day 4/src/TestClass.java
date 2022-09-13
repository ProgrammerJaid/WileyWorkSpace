
public class TestClass {

	public static void main(String[] args) {
		/*BankAccount bAcc = new BankAccount(2234334l, 0);
		bAcc.depositAmount(1000);
		
		BankAccount bAcc1 = new BankAccount(2234334l, 1);
		bAcc1.depositAmount(10);
		bAcc1.withDrawAmount(12);*/
		
		BankAccountType bT = new BankAccountType(2134443543l, 1000, AccountType.CURRENT);
		bT.depositAmount(500);
		bT.withDrawAmount(600);
		
		BankAccountType bT2 = new BankAccountType(2134443543l, 600, AccountType.CURRENT);
		bT2.depositAmount(500);
	}
}
