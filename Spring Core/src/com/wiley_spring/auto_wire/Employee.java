package com.wiley_spring.auto_wire;

import com.wiley_spring.Address;

public class Employee {

	private int id;
	private String name;
	private Address add;

	public Employee() {
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

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

}
