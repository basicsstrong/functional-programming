package com.basicsstrong.functional.section14;

public class QueueDemo {

	public static void main(String[] args) {
		
		
		QueueFun<String> q = QueueFun.queue();
		
		QueueFun<String> enqueue = q.enqueue("Hey").enqueue(" How are you?").enqueue(" Fine?");
		
		enqueue.forEach(System.out::println);
		
		QueueFun<String> dequeue = enqueue.dequeue();
		
		dequeue.forEach(System.out::println);
		
		System.out.println(dequeue.peek());
		
		System.out.println(dequeue.isEmpty());
		
		System.out.println(dequeue.size());

		
	}

}
