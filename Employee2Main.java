package com.practice;

import java.util.Scanner;

public class Employee2Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter employee name :");
		String name = sc.nextLine();
		
		System.out.println("Enter employee salary :");
		double salary = sc.nextDouble();
		
		Employee2 e = new Employee2(name, salary);
		
		e.getDetails();
		e.increment();
		
		sc.close();
		
	}
	
}
