package com.me.entity;

import java.util.Comparator;

public class DescNameSorter implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		int diff = 0;
		diff = o2.getName().compareTo(o1.getName());
		
		if(diff == 0){
			diff = o2.getEmpid() - o1.getEmpid();
		}
		return diff;
	}
}