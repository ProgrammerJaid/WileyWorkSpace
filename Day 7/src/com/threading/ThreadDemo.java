package com.threading;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" In main.");
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()+" In task 1");
			}
		};

		Thread t1 = new Thread(task);
			t1.start();
	}
}
