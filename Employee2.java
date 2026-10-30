package com.practice;

public class Employee2 {

	String name;
	private double salary;
	
	public Employee2(String name, double salary) {
		
		this.name = name;
		this.salary = salary;
		
	}
	public void getDetails() {
		
		System.out.println("Employee Name = "+name);
		System.out.println("Employee salary before increment = "+salary);
		
	}
	
	public void increment() {
		
		salary =salary + salary * 0.10;
		System.out.println("Employee salary after increment = "+salary);
		
	}
	
}
