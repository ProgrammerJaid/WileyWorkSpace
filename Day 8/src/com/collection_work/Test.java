package com.collection_work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		List<Employee> empL = new ArrayList<>();
		
		int n = Integer.parseInt(in.nextLine());
		while(n>0) {
			Employee emp;
			System.out.println("Enter the employee "+n);
			try {
				emp = createEmployee(in);
			} catch (WrongData e) {
				System.err.println(e.getMessage());
				continue;
			}
			empL.add(emp);
			n--;
		}
		in.close();
		
		System.out.println(empL);
	}
	
	private static Employee createEmployee(Scanner in) throws WrongData {
		Employee e = new Employee();
		int id = Integer.parseInt(in.nextLine());
		String name = in.nextLine();
		e.setId(id);
		e.setName(name);
		return e;
	}

	private final static void getAns() {
		
	}
	
}
