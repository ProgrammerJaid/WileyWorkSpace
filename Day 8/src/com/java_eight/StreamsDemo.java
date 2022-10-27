package com.java_eight;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		
//		List<Integer> list = Arrays.asList(1,2,3,5,3,2,6,7);
//		list.stream().filter((n)->n%2==0).forEach(System.out::println);
		
		
		List<Employee> empList = Arrays.asList(new Employee(3,"JJ",23_000),
				new Employee(1, "Shivam",28_000),new Employee(2, "Deepak",25_000),
				new Employee(4, "Naga",25_000),new Employee(5, "Sagar",30_000));
		
//		empList.stream().filter((e)->e.getfName().startsWith("J")).forEach(System.out::println);
//		empList.stream().map((e)->e.getId()).filter(n->n%2==1).forEach(System.out::println);
//		empList.stream().map((e)->e.getfName()).filter((n)->n.contains("a")).forEach(System.out::println);
//		System.out.println(empList.stream().anyMatch(d->d.getSalary()>23000));
		
//		List<Employee> collect = empList.stream().filter((e)->e.getSalary()>22_000).
//				distinct().collect(Collectors.toList());
//		System.out.println(collect);
//		
//		TreeSet<Employee> collect2 = empList.stream().filter((e)->e.getId()<4)
//				.collect(Collectors.toCollection(()-> new TreeSet<>()));
//		
//		System.out.println(collect2);
		
		Employee[] array = empList.toArray(new Employee[empList.size()]);
		Object[] array2 = empList.stream().toArray();
		System.out.println(array);
		System.out.println(array2);
		
		//TODO: check peek() method.
		
	}
}
