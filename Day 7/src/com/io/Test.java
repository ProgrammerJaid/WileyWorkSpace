package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Sk Jaid.");
		Employee emp2 = new Employee(2, "MOhit");
		Employee emp3 = new Employee(3,"Salal");
		List<Employee> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		//writeObject(emps);
		readObject();
	}

	public static void writeObject(List<Employee> emps) {
		try(ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("serial2.serial"))){
			out.writeObject(emps);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private static void readObject() {
		
		try(ObjectInputStream in = new ObjectInputStream(
				new FileInputStream("serial2.serial"))){
			List<Employee> empList = new ArrayList<Employee>();
			empList = (List<Employee>) in.readObject();
			for(Employee e:empList)
				System.out.println(e);
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
