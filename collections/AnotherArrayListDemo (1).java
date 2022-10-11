package com.me.client;

import java.util.ArrayList;

public class AnotherArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers = new ArrayList<Integer>();
		ArrayList<Integer>duplicateNumbers = new ArrayList<Integer>();
		
		numbers.add(99);
		numbers.add(100);
		numbers.add(200);
		numbers.add(100);
		
		System.out.println("Contents of numbers:");
		System.out.println(numbers);
		
		//It will add all elements from numbers to duplicateNumbers
		duplicateNumbers.addAll(numbers);
		
		System.out.println("Contents of duplicate numbers:");
		System.out.println(duplicateNumbers);
		
		duplicateNumbers.remove(0);
		duplicateNumbers.add(199);
		
		System.out.println("Contents of duplicate numbers, after modification:");
		System.out.println(duplicateNumbers);
		
		boolean areTheySame = numbers.containsAll(duplicateNumbers);
		
		if(areTheySame){
			System.out.println("Both are same");
		}else{
			System.out.println("Both are not same");
		}
		System.out.println("numbers: " + numbers);
		System.out.println("duplicate numbers: " + duplicateNumbers);
		if(numbers.contains(100)){
			System.out.println("100 is present");
		}
	}
}