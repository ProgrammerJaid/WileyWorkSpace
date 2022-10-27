package com.wiley_spring.collection;

import java.util.HashMap;

public class CustomerMap {

	private HashMap<Integer, Customer> customers;

	public CustomerMap() {
	}

	public HashMap<Integer, Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(HashMap<Integer, Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "CustomerHashMap [HashMap=" + customers + "]";
	}

}
