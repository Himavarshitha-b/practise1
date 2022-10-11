package com.me.client;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>numbers = new LinkedList<Integer>();
		
		numbers.add(99);
		numbers.add(100);
		numbers.add(200);
		numbers.add(100);
		
		System.out.println(numbers);
		
		int size = numbers.size();
		
		System.out.println("Using simple for loop:");
		for(int i = 0 ; i < size ; i++){
			System.out.println(numbers.get(i));
		}
		
		Iterator<Integer>itr = numbers.iterator();
		ListIterator<Integer>ltr = numbers.listIterator();
		
		System.out.println("Using Iterator:");
		
		while(itr.hasNext()){
			Integer number = itr.next();
			System.out.println(number);
			//itr.remove();
			//numbers.add(90); Adding elements while using iterator is not allowed.
		}
		
		System.out.println("Using List Iterator:");
		
		while(ltr.hasNext()){
			Integer number = ltr.next();
			System.out.println(number);
			ltr.add(40);//This is add method of List Iterator & not ArrayList. Hence, valid.
			//numbers.add(55);//Throws ConcurrentModificationException.
		}
		
		System.out.println("Using List Iterator in reverse order:");
		
		while(ltr.hasPrevious()){
			Integer number = ltr.previous();
			System.out.println(number);
		}
		
		System.out.println("Using for-each loop:");
		
		//Internally implements Iterator interface:
		for (Integer number : numbers) {
			System.out.println(number);
		}
	}
}