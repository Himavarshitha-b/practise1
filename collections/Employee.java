package com.me.entity;

public class Employee implements Comparable<Employee>{
	/**
	 * 
	 */
	//private static final long serialVersionUID = -7093709538191811366L;
	/*private class Address {
		private String city;
		private String state;
		
		private Address(String city, String state) {
			this.city = city;
			this.state = state;
		}

		@Override
		public String toString() {
			return "Address [city=" + city + ", state=" + state + "]";
		}
	}*/
	
	
	private int empid;
	private String name;
	private float salary;
	//private Address address;
	
	public Employee() {
		super();
	}

	public Employee(int empid, String name, float salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int empid, String name, float salary, String city, String state) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		//this.address = new Address(city, state);
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return empid;
	}
	/*
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}*/

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object empl) {
		boolean areTheySame = true;
		Employee another = null;
		
		if(empl.getClass().getName().contains("Employee")) {
			another = (Employee)empl;
			
			if(empid == another.empid && 
					name.equals(another.name) &&
					salary == another.salary) {
				areTheySame = true;
			}else {
				areTheySame = false;
			}
		}else {
			areTheySame = false;
		}
		
		return areTheySame;
	}

	public int compareTo(Employee o) {
		int result = Float.floatToIntBits(o.salary) - Float.floatToIntBits(this.salary);
		
		if(result == 0){
			result = this.empid - o.empid;
		}
		return result;
	}

	
	/*@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}*/

	
	/*public int compareTo(Employee o) {//Ascending sequence of salary.
		return Float.floatToIntBits(this.salary) - Float.floatToIntBits(o.salary);
	}*/

/*	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}*/
}