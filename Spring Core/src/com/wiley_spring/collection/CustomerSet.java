package com.wiley_spring.collection;

import java.util.HashSet;

public class CustomerSet {

	private HashSet<Customer> customers;

	public CustomerSet() {
	}

	public CustomerSet(HashSet<Customer> customers) {
		this.customers = customers;
	}

	public HashSet<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(HashSet<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "CustomerSet [customers=" + customers + "]";
	}

}
