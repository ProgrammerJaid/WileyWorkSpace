package com.presentations;

public class TestClass {

	public static void main(String[] args) {
		SynchronizationDemo demo = new SynchronizationDemo();
		demo.setData(10);
		Thread naga = new Thread(demo);
		Thread deepak = new Thread(demo);
		naga.setName("Naga");
		deepak.setName("Deepak");
		naga.start();
		deepak.start();
	}
}

class SynchronizationDemo implements Runnable {

	private int data;
	
	@Override
	public void run() {
		takeData(10);
		if(data<0)
			System.out.println("Wrong logic.");
	}
	
	public void setData(int data) {
		this.data=data;
	}
	
	private synchronized void takeData(int no) {
		if (data >= no) {
			System.out.println(Thread.currentThread().getName() + " is about to withdraw ...");
			data -= no;
			System.out.println(Thread.currentThread().getName() + " has withdrawn " + no + " rupees");
		} else
	    	System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());	    
	}
}

