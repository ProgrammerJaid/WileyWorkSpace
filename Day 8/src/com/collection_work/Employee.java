package com.collection_work;

import java.util.Comparator;

public class Employee /* implements Iterable<Integer> */ {

	private int id;
	private String name;

	public Employee() {
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

//	@Override
//	public Iterator<Employee> iterator() {
//		return new ArrayList<Employee>().iterator();
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) throws WrongData {
		if(!check(name))
			throw new WrongData();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return this.name.equals(e.name);
	}

	private boolean check(String name) {
		for(char c:name.toCharArray())
			if(Character.isDigit(c))
				return false;
		return true;
	}
	
}

class EmployeeIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getId() > o2.getId())
			return 1;
		else if (o2.getId() > o1.getId())
			return -1;
		return 0;
	}

}

class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
