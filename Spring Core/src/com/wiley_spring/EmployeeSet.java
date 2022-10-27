package com.wiley_spring;

import java.util.Set;

public class EmployeeSet {
	Set<Employee> uniqueEmp;

	public EmployeeSet(Set<Employee> uniqueEmp) {
		this.uniqueEmp = uniqueEmp;
	}

	public Set<Employee> getUniqueEmp() {
		return uniqueEmp;
	}

	public void setUniqueEmp(Set<Employee> uniqueEmp) {
		this.uniqueEmp = uniqueEmp;
	}

	@Override
	public String toString() {
		return "EmployeeSet [uniqueEmp=" + uniqueEmp + "]";
	}

}
