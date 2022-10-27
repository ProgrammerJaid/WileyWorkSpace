package com.project.entity;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {
	private String customerId;
	private String customerName;
	private String customerAreaCode;
	private int numberOfUnitsConsumed;
	private double totalBill;

	public Customer(String customerId, String customerName, String customerAreaCode, int numberOfUnitsConsumed, double bill) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAreaCode = customerAreaCode;
		this.numberOfUnitsConsumed = numberOfUnitsConsumed;
		this.totalBill = bill;
	}

	public String getCustomerAreaCode() {
		return customerAreaCode;
	}

	public double getTotalBill() {
		return totalBill;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(customerAreaCode, other.customerAreaCode) && Objects.equals(customerId, other.customerId)
				&& Objects.equals(customerName, other.customerName)
				&& numberOfUnitsConsumed == other.numberOfUnitsConsumed
				&& Double.doubleToLongBits(totalBill) == Double.doubleToLongBits(other.totalBill);
	}

	@Override
	public String toString() {
		return "Customer [CustomerId=" + customerId + ", CustomerName=" + customerName + ", CustomerAreaCode="
				+ customerAreaCode + ", NumberOfUnitsConsumed=" + numberOfUnitsConsumed + ", CustomerBill=" + totalBill
				+ "]";
	}
}
