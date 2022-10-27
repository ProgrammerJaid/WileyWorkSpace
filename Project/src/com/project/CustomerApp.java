package com.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.project.entity.Customer;
import com.project.utilty.CustomerUtility;
import com.project.utilty.CustomerValidation;

public class CustomerApp {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		List<Customer> customerlist = new ArrayList<>();
		int i = 1;
		String customerId;
		String customerName = null;
		String customerAreaCode = null;
		int numberOfUnitsConsumed = 0;
		String s;
		double bill;
		boolean b = false;
		while (i != 0) {
			System.out.println("Customer " + (customerlist.size() + 1) + " details");
			System.out.print("Id : ");
			customerId = sc.next();
			while (b == false) {
				System.out.print("Name : ");
				customerName = sc.next();
				b = CustomerValidation.validation(customerName);
			}
			b = false;
			while (b == false) {
				System.out.print("Area Code : ");
				customerAreaCode = sc.next();
				b = CustomerValidation.validatecode(customerAreaCode);
			}
			b = false;
			while (numberOfUnitsConsumed == 0) {
				System.out.print("Number of units consumed : ");
				s = sc.next();
				numberOfUnitsConsumed = CustomerValidation.validatenumber(s);
			}
			bill = CustomerUtility.calculateTotalBill(numberOfUnitsConsumed);
			customerlist.add(new Customer(customerId, customerName, customerAreaCode, numberOfUnitsConsumed, bill));
			System.out.println("Customer " + customerlist.size() + " details enrolled");
			System.out.println("If you want to add new Customer enter any number else 0");
			while (i != 0) {
				s = sc.next();
				i = CustomerValidation.validatenumber(s);
				if (i != 0)
					break;
			}
		}
		CustomerUtility.display(customerlist);

		System.out.println("---------------------------");

		CustomerUtility.sort(customerlist);
		System.out.println("---------------------------");

		System.out.println("Enter the area code to be searched \n");
		String AreaCode = sc.next();
		CustomerUtility.search(AreaCode, customerlist);
		System.out.println("---------------------------");

		System.out.println();
		CustomerUtility.serializeObject(customerlist);

		List<Customer> readObjects = CustomerUtility.readObjects();
		System.out.println(readObjects);
		System.out.println("---------------------------");

		System.out.println();

		CustomerUtility.groupBy(customerlist);
		sc.close();
	}

}
