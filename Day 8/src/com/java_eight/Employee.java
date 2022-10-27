package com.java_eight;

import java.util.Objects;

public class Employee implements Comparable {

	private int id;
	private String fName;
	private double salary;

	public Employee(int id, String fName) {
		this.id = id;
		this.fName = fName;
	}

	public Employee(int id, String fName, double salary) {
		this(id, fName);
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		return this.id>((Employee)(o)).id?1:-1;
	}
	
	

}
