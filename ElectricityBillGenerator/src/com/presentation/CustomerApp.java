package com.presentation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.presentation.entity.Customer;
import com.presentation.entity.CustomerUtility;
import com.presentation.exception.InvalidCustomerException;

public class CustomerApp {

	private static List<Customer> customerList;

	private static Customer addCustomer(Scanner in) throws InvalidCustomerException {

		Customer c1 = new Customer();
		int id = Integer.parseInt(in.nextLine());
		c1.setCustomerId(id);
		c1.setCustomerName(in.nextLine());
		c1.setCustomerAreaCode(in.nextLine());
		c1.setNoOfUnitsConsumed(Integer.parseInt(in.nextLine()));
		return c1;
	}

	public static void main(String[] args) {

		customerList = new ArrayList<Customer>();
		System.out.println("Enter the number of customer:");
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());

		System.out.println("\tIn Format: id->name->area code-> units used");

		while (n > 0) {
			System.out.println("\tEnter Customer:" + n + "\n");
			Customer c1;
			try {
				c1 = addCustomer(in);
			} catch (InvalidCustomerException e) {
				System.err.println(e.getMessage() + " Please enter the customer details again");
				continue;
			}
			customerList.add(c1);
			n--;
		}
		in.close();
		calculateBill();
		sortByDescendingOrderOfBill();
		CustomerUtility.getDetailsFromCustomerAreaCode("JJ", customerList);
		CustomerUtility.getCustomerByTheirAreaCode(customerList);

		serializeAndDesirialize();
	}

	private static void serializeAndDesirialize() {
		CustomerUtility.serializeObject(customerList); // Serialization part
		List<Customer> readObjects = CustomerUtility.readObjects();
		readObjects.stream().forEach(System.out::println);
	}

	private static void calculateBill() {
		for (Customer c : customerList)
			CustomerUtility.calculateTotalBill(c);
	}

	private static void sortByDescendingOrderOfBill() {
		Collections.sort(customerList, new CustomerUtility.SortedByBillDesc());
		customerList.stream().forEach(System.out::println);
	}

}
