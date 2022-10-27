package com.collection_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

public class TestClass {

	public static void main(String[] args) {
		
		String[] arr = {"Shivam","Naga","Deepak","Mohit"};
		Integer[] arr1 = {1,2,4,8,9,7};
		List<String> names = new ArrayList<>(Arrays.asList(arr));
		Iterator<String> itr = names.iterator();
		List<Integer> list1 = new ArrayList<>();		//Arrays.asList(arr1) will throw error
		for(int i:arr1)
			list1.add(i);
		
		while(itr.hasNext()) {
			String k = itr.next();
			System.out.println(k);
			if(k.equals("Naga"))
				itr.remove();
		}
		
//		Iterator<Integer> iterator = list1.iterator();
//		while(iterator.hasNext()) {
//			int element = iterator.next();
//			System.out.println("element: "+element);
//			
//			if(element==8) {
//				iterator.remove();	//With Iterator we can manage list1 and no exception will be thrown
//				//iterator.forEachRemaining(Filter::add); 	//We are saying add 7 to it as 8 is reached
//			}
//		}
		
		System.out.println(list1);
		System.out.println(names);
		
		/*List<Employee> list = new ArrayList<>();
		list.add(new Employee(1, "SHivam"));
		list.add(new Employee(2,"Mohit"));
		list.add(new Employee(3, "Naga"));
		list.add(new Employee(4, "Deepak"));

		Collections.sort(list,new EmployeeIdComparator());
		System.out.println(list);
		
		
		for(Employee emp:list)
			System.out.println(emp);
		
		System.out.println("\nWith Iterator.\n");
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
//		System.out.println("\n");
//		Employee e1 = new Employee(1, "Naga");
//		Employee e2 = new Employee(3, "Naga");
//		System.out.println(e2.equals(e1));
		
//		Iterator<Employee> eItr = e.iterator();
//		while(eItr.hasNext())
//			System.out.println("Inside "+eItr.next());*/
		
	}
	
	private final static void getAns() {
		
	}
	
}
