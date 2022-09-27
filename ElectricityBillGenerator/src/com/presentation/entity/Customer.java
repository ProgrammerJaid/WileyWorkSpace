package com.presentation.entity;

import java.io.Serializable;

import com.presentation.exception.InvalidCustomerException;

public class Customer implements Serializable {

	private int customerId;
	private String customerName;
	private String customerAreaCode;
	protected double noOfUnitsConsumed;
	protected double totalBill;

	public Customer() {
	}

	public double getNoOfUnitsConsumed() {
		return noOfUnitsConsumed;
	}

	public void setNoOfUnitsConsumed(double noOfUnitsConsumed) throws InvalidCustomerException {
		if (noOfUnitsConsumed <= 0)
			throw new InvalidCustomerException("Invalid units provided.");
		this.noOfUnitsConsumed = noOfUnitsConsumed;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAreaCode(String customerAreaCode) throws InvalidCustomerException {
		if (customerAreaCode.length() != 6)
			throw new InvalidCustomerException(customerAreaCode + "is not valid");
		this.customerAreaCode = customerAreaCode;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerAreaCode() {
		return customerAreaCode;
	}

	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAreaCode="
				+ customerAreaCode + ", noOfUnitsConsumed=" + noOfUnitsConsumed + ", totalBill=" + totalBill + "]";
	}

}
