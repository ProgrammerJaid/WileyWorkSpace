package com.project.utilty;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.project.entity.Customer;

public class CustomerUtility {

	private static List<Customer> cList;

	public static class CompareBill implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			return o2.getTotalBill() > o1.getTotalBill() ? 1 : -1;
		}
	}

	public static boolean display(List<Customer> customer) {
		System.out.println("Our Customers are :");
		customer.stream().forEach((c) -> System.out.println(c));
		return true;
	}

	public static boolean sort(List<Customer> customer) {
		System.out.println("\nCustomers Sorted According to Their Bill :");
		customer.sort(new CompareBill());
		customer.stream().forEach((c) -> System.out.println(c));
		return true;
	}

	public static List<Customer> search(String areaCode, List<Customer> customer) {
		System.out.println("\nCustomers With Area Code " + areaCode + " are : ");
		List<Customer> customerList=customer.stream().filter((c) -> c.getCustomerAreaCode()
				.equals(areaCode)).collect(Collectors.toList());
		
		customerList.stream().forEach(System.out::println);
		
		return customerList;
	}

	public static double calculateTotalBill(int units) {
		double amount = 0.0;
		if (units > 150)
			amount = (units - 150);
		units = 150;
		if (units <= 150 && units >= 101)
			amount = amount + (units - 100) * 0.75;
		units = 100;
		if (units <= 100)
			amount = amount + (units) * 0.50;
		return amount;
	}

	public static boolean serializeObject(List<Customer> list) {

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("customer.serial"))) {
			out.writeObject(list);

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return true;
	}

	public static List<Customer> readObjects() {

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("customer.serial"))) {
			cList = (List<Customer>) in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return cList;
	}

	public static boolean groupBy(List<Customer> list) {

		Map<String, List<Customer>> mm = Optional.ofNullable(list).orElseGet(ArrayList::new).stream()
				.collect(Collectors.groupingBy(Customer::getCustomerAreaCode));

		for (Map.Entry<String, List<Customer>> entry : mm.entrySet()) {
			System.out.print(entry.getKey() + ":");
			int x = 0;
			for (Customer c : entry.getValue()) {
				if (x > 0) {
					System.out.println("       " + c);
				} else {
					System.out.println(c);
					x++;
				}
			}
		}
		
		return true;
	}
}
