package com.me.client;

import java.util.Set;
import java.util.TreeSet;

import com.me.entity.Employee;

public class HashSetEmployeeDemo {

	public static void main(String[] args) {
		Set<Employee>employees = new TreeSet<Employee>();
		
		Employee employeeOne = new Employee(1, "abc", 90000);
		Employee employeeTwo = new Employee(2, "xyz", 120000);
		Employee employeeThree = new Employee(1, "abc", 90000);
		Employee employeeFour= new Employee(3, "abc", 100000);
		
		employees.add(employeeOne);
		employees.add(employeeTwo);
		employees.add(employeeThree);
		employees.add(employeeFour);
		
		System.out.println(employees);
	}
}