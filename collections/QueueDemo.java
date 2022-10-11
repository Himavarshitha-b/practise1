package com.me.client;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<Integer>queueNumbers = new LinkedList<Integer>();
				
		queueNumbers.add(90);
		queueNumbers.add(87);
		queueNumbers.add(7);
		queueNumbers.add(73);
		queueNumbers.add(8);
		queueNumbers.add(62);
		
		System.out.println("Size of the Queue: " + queueNumbers.size());
		int x = queueNumbers.poll();
		System.out.println(x);
		System.out.println("Size of the Queue: " + queueNumbers.size());
		
		x = queueNumbers.peek();
		System.out.println(x);
		
		x = queueNumbers.peek();
		System.out.println(x);
		
		x = queueNumbers.remove();
		System.out.println(x);
		System.out.println("Size of the Queue: " + queueNumbers.size());
	}
}