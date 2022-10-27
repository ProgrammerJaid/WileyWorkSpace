package com.collection_work;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.TreeMap;

public class QueueDemo {

	public static void main(String[] args) {
		//queueDemo();
		//dequeDemo();
		propsDemo();
		Map<Integer,Integer> mp = new TreeMap<>();
	}

	private static void propsDemo() {
		Properties prop = new Properties();
		System.out.println();
		prop.setProperty("User", "jaid");
		prop.setProperty("Password", "IJqswndnwen");

		try {
			OutputStream out = new FileOutputStream("dataConfig.properties");
			prop.store(out, "comments shivam");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(prop.getProperty("User"));

		Properties props = System.getProperties();
		Enumeration itr = props.elements();
		while(itr.hasMoreElements())
			System.out.println(itr.nextElement());
		//System.out.println(props);
	}

	private static void queueDemo() {
//		Queue<Integer> q = new LinkedList<>();
//		q.add(12);
//		q.offer(13);		//capacity
//		q.offer(15);
//
//		System.out.println(q.peek());
//		while (!q.isEmpty())
//			System.out.println(q.remove()); // this throws exception
//
//		System.out.println(q.poll()); // this does not throw exception
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());	//minHeap
		pq.add(4);
		pq.add(5);
		pq.add(1);
		
		System.out.println(pq.poll());
	}

	private static void dequeDemo() {
		System.out.println("\nInside dequeTest ...");

		// Queue - FIFO
		Deque<String> deque = new ArrayDeque<>(); // Use ArrayDeque<> recommended approach
		deque.add("walden");
		deque.add("harry potter");
		deque.add("Head first Java");
		
		System.out.println(deque.pop());
		
		System.out.println("\nPrinting Queue ...");
		System.out.println(deque.remove());
		System.out.println(deque.remove());
		System.out.println(deque.remove());

		// Stack -LIFO
		// Using the same deque as stack as deque is empty
		deque.push("walden");
		deque.push("harry potter");
		deque.push("Head first Java");

		System.out.println("\nPrinting Stack ...");
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
	}
}
