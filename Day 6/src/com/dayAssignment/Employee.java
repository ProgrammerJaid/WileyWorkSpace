package com.dayAssignment;

import java.util.Arrays;

public class Employee {

	private long empId;
	private String empName;
	private Address[] address;

	public Employee(long empId, String empName, Address[] address) {
		this.empId = empId;
		this.empName = empName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + Arrays.toString(address) + "]";
	}

}

class Address {

	private int flatNo;
	private String flatName;
	private String roadName;
	private String cityName;

	public Address(int flatNo, String flatName, String roadName, String cityName) {
		this.flatNo = flatNo;
		this.flatName = flatName;
		this.roadName = roadName;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", flatName=" + flatName + ", roadName=" + roadName + ", cityName="
				+ cityName + "]";
	}

}
