package com.me.client;
import java.util.LinkedList;

public class AnotherDemo {

	public static void main(String[] args) {
		LinkedList<Integer>numbers = new LinkedList<Integer>();
		LinkedList<Integer>nums = new LinkedList<Integer>();
		
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(10);
		
		nums.addAll(numbers);
		
		nums.add(50);
		nums.add(70);
		
		System.out.println("numbers:");
		System.out.println(numbers);
		
		System.out.println("nums:");
		System.out.println(nums);
		
		nums.retainAll(numbers);
		
		System.out.println("\nAfter retainAll:\n");
		
		System.out.println("numbers:");
		System.out.println(numbers);
		
		System.out.println("nums:");
		System.out.println(nums);
		
		nums.add(50);
		nums.add(70);
		
		System.out.println("After adding:");
		
		System.out.println("numbers:");
		System.out.println(numbers);
		
		System.out.println("nums:");
		System.out.println(nums);
		
		nums.removeAll(numbers);
		
		System.out.println("\nAfter removeAll:\n");
		
		System.out.println("numbers:");
		System.out.println(numbers);
		
		System.out.println("nums:");
		System.out.println(nums);		
	}
}