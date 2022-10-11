package com.me.client;
import java.util.ArrayList;

public class RemoveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		
		System.out.println("Before removal:");
		System.out.println(numbers);
		
		numbers.remove(2);//Removes object at given index.
		
		System.out.println("After removal:");
		System.out.println(numbers);
		
		numbers.remove(new Integer(10));//Removes first occurence from arraylist
		
		System.out.println("After removal:");
		System.out.println(numbers);
		
		numbers.remove(10);//Exception as there are only two elements.
		
		System.out.println("After removal:");
		System.out.println(numbers);
	}
}