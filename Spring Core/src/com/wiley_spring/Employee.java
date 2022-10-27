package com.wiley_spring;

import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private Address add;

	public Employee() {
	}

//	public Employee(String name, int id) {
//		this.id = id;
//		this.name = name;
//	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	public Employee(int id, String name, String dept, Address add) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.add = add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", add=" + add + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(add, dept, id, name);
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
		return Objects.equals(add, other.add) && Objects.equals(dept, other.dept) && id == other.id
				&& Objects.equals(name, other.name);
	}

}
