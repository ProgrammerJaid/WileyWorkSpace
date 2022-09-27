package com.presentation.entity;

import static com.presentation.constants.Constants.BASE_USAGE;
import static com.presentation.constants.Constants.SECOND_MAX_USAGE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.presentation.constants.Constants;

public class CustomerUtility {

	private static List<Customer> list;

	public static class SortedByBillDesc implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			return (int) (o2.getTotalBill() - o1.getTotalBill());
		}
	}

	public static class SortById implements Comparator<Customer> {

		@Override
		public int compare(Customer o1, Customer o2) {
			return (int) (o1.getCustomerId() - o2.getCustomerId());
		}
	}

	public static void serializeObject(List<Customer> list) {

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("customer.serial"))) {
			out.writeObject(list);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static List<Customer> readObjects() {

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("customer.serial"))) {
			list = (List<Customer>) in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return list;
	}

	public static double calculateTotalBill(Customer c) {
		if (c.noOfUnitsConsumed > 150)
			return c.totalBill += ((50 * BASE_USAGE.getPrice()) + (100 * SECOND_MAX_USAGE.getPrice())
					+ ((c.noOfUnitsConsumed - 150) * Constants.MAX_USAGE.getPrice()));
		else if (c.noOfUnitsConsumed > 100)
			return c.totalBill += ((100 * BASE_USAGE.getPrice())
					+ (c.noOfUnitsConsumed - 100) * SECOND_MAX_USAGE.getPrice());

		return c.totalBill += c.noOfUnitsConsumed * BASE_USAGE.getPrice();
	}

	public static void getDetailsFromCustomerAreaCode(String areaCode, List<Customer> list) {
		list.stream().filter((c) -> c.getCustomerAreaCode().equals(areaCode)).forEach((c) -> System.out.println(c));

	}

	public static void getCustomerByTheirAreaCode(List<Customer> customerList) {

		Map<String, List<Customer>> mp = new HashMap<>();

		for (Customer c : customerList) {
			List<Customer> orDefault = mp.getOrDefault(c.getCustomerAreaCode(), new ArrayList<Customer>());
			orDefault.add(c);
			mp.put(c.getCustomerAreaCode(), orDefault);
		}

		for (String s : mp.keySet())
			System.out.println("key " + s + " Value: " + mp.get(s));
	}

}
