package com.me.client;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapPlainDemo {
	public static void main(String[] args) {
		Map<Integer, Float>studRecords = new LinkedHashMap<>();
		
		studRecords.put(1, 98f);
		studRecords.put(88, 88f);
		studRecords.put(3, 91f);
		studRecords.put(4, 92f);//new value
		studRecords.put(5, 97f);
		studRecords.put(6, 93f);
		studRecords.put(2, 98f);
		studRecords.put(18, 88f);
		studRecords.put(35, 91f);
		studRecords.put(41, 92f);//new value
		studRecords.put(52, 97f);
		studRecords.put(63, 93f);
		studRecords.put(41, 99f);//value gets replaced in map.
		studRecords.put(4, 89f);//value gets replaced in map.
		
		//get() method retrieves value for passed key.
		System.out.println(studRecords.get(4));//89
		
		Set<Integer>rollNos = studRecords.keySet();
		
		for (Integer rollNo : rollNos) {
			System.out.println("Roll No: " + rollNo + " has "+
		studRecords.get(rollNo));
		}
		
		Collection<Float>percentages = studRecords.values();
		
		System.out.println("Only percentages:");
		for (Float percent : percentages) {
			System.out.println(percent);
		}
	}
}