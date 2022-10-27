package com.project.utilty;

import java.util.Scanner;

public class CustomerValidation {
	public static boolean validation(String string) {
		Scanner sc = new Scanner(System.in);
		int j = 0;
		while (j == 0) {
			try {
				boolean a = string.matches("^[a-zA-Z]*$");
				while (!a) {
					throw new UserException(
							"Name should not contain numbers or special characters \nEnter the input again :");
				}
				j = 1;
			} catch (UserException e) {
				System.out.println(e.getMessage());
				return false;
			}
		}
		return true;
	}
	public static boolean validatecode(String string) {
		int j = 0;
		while (j == 0) {
			try {
				if (string.length() == 6) {
					int temp = 0;
					try {
						while (temp < string.length()) {
							if (Character.isDigit(string.charAt(temp)) == false) {
								throw new UserException(
										"Area code should contain six digits \nEnter the input again :");
							}
							temp++;
						}
						j = 1;
					} catch (UserException e) {
						System.out.println(e.getMessage());
						return false;
					}
				}

				else {
					throw new UserException("Area code should contain six digits \nEnter the input again :");
				}

			} catch (UserException e) {
				System.out.println(e.getMessage());
				return false;
			}

		}
		return true;
	}

	public static int validatenumber(String s) {
		int j = 0;
		int n = 0;
		while (j == 0) {
			try {
				n = Integer.parseInt(s);
				if (n < 0) {
					throw new UserException("Number cannot be negetive \nEnter the input again");
				}
				j = 1;
			} catch (NumberFormatException e) {
				System.out.println("Input is not a valid integer \nEnter the input again");
				return 0;
			} catch (UserException e) {
				System.out.println(e.getMessage());
				return 0;
			}
		}
		return n;
	}
}