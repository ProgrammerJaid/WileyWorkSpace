package com.stack_and_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackAndQueue<T> {

	Deque<T> d;
	Deque<T> tmp;

	public StackAndQueue(Deque<T> d) {
		this.d = new ArrayDeque<T>();
		this.tmp = new ArrayDeque<T>();
	}

	public Deque<T> addInStack(T t) {
		while (!d.isEmpty())
			tmp.offer(d.poll());

		d.offer(t);
		while (!tmp.isEmpty())
			d.offer(tmp.poll());

		return d;
	}

	public Deque<T> addInQueue(T t) {
		while (!d.isEmpty())
			tmp.push(d.pop());

		d.push(t);
		while (!tmp.isEmpty())
			d.push(tmp.pop());

		return d;
	}

	public T pop() {
		T data;

		while (!d.isEmpty())
			tmp.push(d.pop());

		data = tmp.pop();
		while (!tmp.isEmpty())
			d.push(tmp.pop());

		return data;
	}

	public T poll() {

		T data;

		while (!d.isEmpty())
			tmp.offer(d.poll());

		data = tmp.poll();
		while (!tmp.isEmpty())
			d.offer(tmp.poll());

		return data;
	}

}
