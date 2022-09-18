package com.dayAssignment;

public class Email {

	private String email;

	public Email(String email) {
		this.email = email;
	}
	
	public void validateEmail() throws InvalidEmailException {
		
		if(email.contains(".."))
			throw new InvalidEmailException();
		
		String[] parts = email.split("[@]+");
		if(parts.length!=2)
			throw new InvalidEmailException();
		
		if(parts[0].startsWith(".") || parts[0].endsWith("."))
			throw new InvalidEmailException();
		
		String[] domains = parts[1].split("[.]+");
		if(domains.length!=2 || checkDigit(domains[0]))
			throw new InvalidEmailException();
		
		System.out.println("Valid Email.");
	}

	private boolean checkDigit(String string) {
		
		for(char c:string.toCharArray())
			if(Character.isDigit(c))
				return true;
			
		return false;
	}
}
