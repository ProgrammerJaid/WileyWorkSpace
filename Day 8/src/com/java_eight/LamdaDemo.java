package com.java_eight;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaDemo {

	public static void main(String[] args) {
		
		Consumer<String> con = (name)->System.out.print(name+" \n");	//Used to consume list
		con.accept("Name");												// Consumer->accept(T t)
		
		Function<Character,Integer> f = (ch)-> (int)ch;				//Used to transform from one form to another
		System.out.println(f.apply('c'));							// Function-> R apply(T t) returns R r
		
		Predicate<String> p = (name)->{						//Used 	to check a condn.					
			if(name.equals("ABC"))	return true;			//Predicate -> test(T t)
			return false;};
			
		Predicate<String> pa = (name)-> name.equals("ABC");		

		System.out.println(p.test("ABC")+" "+pa.test("ABC"));
		
		Supplier<Integer> sup = ()-> 15;				//Used to supply data
		System.out.println(sup.get());					//Supplier 
			
		PrintingInterface<String> print = (name)->System.out.println("my name "+name);	//User defined Functional Interface
		print.print("Shivam");	
			
		ArrayList<String> list = new ArrayList<>();
		list.add("JJ");
		list.add("ABX");
		
		list.forEach((name)->System.out.println(name=name+"auy"));
		System.out.println(list);

	}
}

@FunctionalInterface
interface PrintingInterface<T>{
	public void print(T t);
}
