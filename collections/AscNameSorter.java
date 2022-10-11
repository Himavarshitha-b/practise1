package com.me.entity;

import java.util.Comparator;

public class AscNameSorter implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		int diff = o1.getName().compareTo(o2.getName());
		
		if(diff == 0){
			diff = o1.getEmpid() - o2.getEmpid();
		}
		return diff;
	}
}