package com.basicsstrong.functional.section14;

import java.util.function.Consumer;

public final class QueueFun<T> {

	private final ListFun<T> front;
	private final ListFun<T> rear;

	private QueueFun() {
		this.front = ListFun.list();
		this.rear = ListFun.list();
	}

	// Empty Queue
	public static <T> QueueFun<T> queue() {
		return new QueueFun<T>();
	}

	private QueueFun(QueueFun<T> queue, T element) {
		boolean frontIsEmpty = queue.front.isEmpty();
		this.front = frontIsEmpty ? queue.front.addEle(element) : queue.front;
		this.rear = frontIsEmpty ? queue.rear : queue.rear.addEle(element);
	}

	// enqueue
	public QueueFun<T> enqueue(T t) {
		return new QueueFun<T>(this, t);
	}

	
	// dequeue
	private QueueFun(ListFun<T> front, ListFun<T> rear) {
		final boolean frontIsEmpty = front.isEmpty();
		this.front = frontIsEmpty ? rear.reverseList() : front;
		this.rear = frontIsEmpty ? front : rear;
	}

	public QueueFun<T> dequeue() {
		return new QueueFun<T>(this.front.tail(), rear);
	}
	
	void forEach(Consumer<? super T> action) {
		T current = this.front.head();
		ListFun<T> temp = ListFun.concat(this.front.tail(), this.rear.reverseList());
		while(temp != null) {
			action.accept(current);
			current = temp.head();
			temp = temp.tail();
		}
	}
	
	public int size() {
		return front.length() + rear.length();
	}
	
	public T peek() {
		if(this.size() == 0)
			return null;
		return this.front.head();
	}
	
	public boolean isEmpty() {
		if(this.front.isEmpty() == this.rear.isEmpty() == true)
			return true;
		else
			return false;
	}

}
