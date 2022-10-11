package com.me.client;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String>greetings = new TreeSet<String>(Collections.reverseOrder());
		
		System.out.println(greetings.add("hi"));
		System.out.println(greetings.add("hello"));
		System.out.println(greetings.add("hi there"));
		System.out.println(greetings.add("hi"));
		System.out.println(greetings.add("good afternoon"));
		System.out.println(greetings.add("good morning"));
		System.out.println(greetings.add("good afternoon"));
		
		System.out.println(greetings);
		
		Iterator<String>itr = greetings.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}