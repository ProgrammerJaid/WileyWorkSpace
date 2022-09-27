package com.stack_and_queue;

import java.util.Stack;

public class QueueUsingStack {
	static Stack<Integer> s1=new Stack<>();
	static Stack<Integer> s2=new Stack<>();
	public static void printQueue() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		while(!s2.isEmpty()) {
			System.out.print(s2.pop()+" ");
		}
		
	}
	public static void addElement(int data) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	public static void delete() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s2.pop();
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	public static void main(String[] args) {
		s1.push(1);
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.push(5);
		s1.push(6);
		s1.push(7);
		addElement(0);
		delete();
		printQueue();
	}
}
