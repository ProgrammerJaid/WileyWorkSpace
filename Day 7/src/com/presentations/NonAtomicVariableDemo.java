package com.presentations;

public class NonAtomicVariableDemo implements Runnable{

	private int counter;

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is trying to increement value.");
		increementCounter();
	}

	private void increementCounter() {
		this.counter++;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	
}
