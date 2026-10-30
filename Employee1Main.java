package com.practice;

import java.util.Scanner;

public class Employee1Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary Here:");
		double salary = sc.nextDouble();
		
		Employee1 e = new Employee1();
		
		e.setSalary(salary);
		e.getSalary();
		
		sc.close();
		
	}
	
}
