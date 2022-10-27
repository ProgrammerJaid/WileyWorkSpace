package com.database_work;

import java.util.Scanner;

public class Work {
	
	static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Work w = new Work();
		w.test1();
		w.test2();
		in.close();
	}


	private void test1() {
		System.out.println("Enter test1");
		String s= in.nextLine();
		System.out.println(s);
//		inner inp = new inner(System.in);
//		System.out.println("Entestter test1");
//		String k = inp.nextLine();
//		System.out.println(k);
	}
	
	private void test2() {
		System.out.println("Enter test2");
		String s = in.nextLine();
		System.out.println(s);
	}

}
