package com.java_eight;

public class ThreadWorksDemo {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread t0 = new Thread(run);
		t0.start();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		});
		t1.start();
		
		Thread t2 = new Thread(()->System.out.println(Thread.currentThread().getName()));
		t2.start();
		
	}
}
