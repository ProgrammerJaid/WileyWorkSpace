package com.linkedlist_and_map;

public class Employee {

	int id;

	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return this.name.equals("Jaid")?10:11;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return id == other.id;
	}

}
