package com.linkedlist_and_map;

import java.util.HashMap;
import java.util.Map;

public class TestClass {

	public static void main(String[] args) {
		Employee e = new Employee(1,"Sgar");
		Employee e1 = new Employee(1, "Jaid");
		
		Map<Employee,String> mp = new HashMap<>();
		mp.put(e,e.name);
		mp.put(e1, e1.name);
		
		System.out.println(mp);
	}
	
}
