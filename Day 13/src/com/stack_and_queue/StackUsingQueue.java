package com.stack_and_queue;

public class StackUsingQueue {

	static int MAX_SIZE = 10;
	static int front = -1, rear = -1;
	static int[] queue = new int[MAX_SIZE];

	public static void add(int data) {
		if (rear == -1) {
			front = 0;
			rear = 0;
		}
		queue[rear++] = data;
		if (rear == MAX_SIZE) {
			System.out.println("Stack Full");
		}
	}

	public static void printStack() {
		for (int i = rear - 1; i >= front; i--) {
			System.out.print(queue[i] + " ");
		}
	}

	public static void delete() {
		rear--;
		if (rear == -1) {
			System.out.println("stack Empty");
		}
	}

	public static void main(String[] args) {
		add(1);
		add(2);
		add(3);
		add(4);
		add(5);
		add(6);
		add(7);
		add(8);
		add(9);

		delete();
		delete();
		delete();
		delete();
		delete();

		printStack();

	}
}
