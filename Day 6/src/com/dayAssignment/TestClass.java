package com.dayAssignment;

public class TestClass {

	public static void main(String[] args) {
		Email email1 = new Email("dummyMail@gmail.com");
		//Email email2 = new Email("dummyMail@1234.com");		//will fail
		Email email3 = new Email("dummy.Mail@gmail.com");	
		//Email email4 = new Email("dummy..Mail@1234.com");	//will fail
		//Email email5 = new Email(".dummyMail@gmail.com");	//will fail
		//Email email6 = new Email("dummy@Mail@gmail.com");	//will fail
		try {
			email1.validateEmail();
			email3.validateEmail();
		} catch (InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
		
//		int[] arr = {2,1,3,4,5,2};
//		System.out.println(checkFirstAndLast(arr));
		
		BankAccount b1 = new BankAccount(1234l, "JJ", AccountType.SAVINGS);
		BankAccountType b2 = new BankAccountType(1234l, "JJ", AccountType.SAVINGS);
		try {
			b1.calculateTotalInterest(10_000, 2);
			//b2.calculateTotalInterest(-10_000, 2);
		} catch (DepositAmountException e) {
			e.printStackTrace();
		}
		
		Employee emp = new Employee(12345, "Shivam Sahal", new Address[] {
				new Address(12, "YZ", "Aplpha", "Kolkata"),new Address(14, "ABC", "Beta", "Delhi")});
		System.out.println(emp);
	}
	
	@SuppressWarnings("unused")
	private static boolean checkFirstAndLast(int[] arr) {
		if(arr.length<6)
			throw new RuntimeException("Array length must be greater than 5.");
		
		return arr[0]==arr[arr.length-1];
	}
}
