package com.me.entity;

import java.util.Comparator;

public class DscEmpid implements Comparator<Employee> {
	public int compare(Employee o1, Employee o2) {
		return o2.getEmpid() - o1.getEmpid();
	}
}