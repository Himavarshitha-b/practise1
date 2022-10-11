package com.me.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.me.entity.Employee;

public class MapCustom {

	public static void main(String[] args) {
		Map<Integer, Employee>empRecords = new HashMap<>();
		
		Employee employee = null;
		Scanner scInput = new Scanner(System.in);
		
		int empid = 0;
		String name = null;
		float salary = 0.0f;
		
		while(true){
			System.out.print("Enter Employee ID. Enter -999 to stop: ");
			empid = Integer.parseInt(scInput.nextLine());
			
		    if(empid != -999){
		    	System.out.print("Enter Name: ");
				name = scInput.nextLine();
				
				System.out.print("Enter Salary: ");
				salary = Float.parseFloat(scInput.nextLine());
					  	  
				employee = new Employee(empid, name, salary);
				
				empRecords.put(empid, employee);
		    }else{
		    	break;
		    }
		}
		
		System.out.print("Enter Employee ID of the employee, whose record is to be viewed: ");
		empid = Integer.parseInt(scInput.nextLine());
			     
		if(empRecords.containsKey(empid)){
			employee = empRecords.get(empid);
			System.out.println(employee);
		}else{
			System.out.println("Given employee ID record doesn't exist.");
		}
		scInput.close();
	}
}