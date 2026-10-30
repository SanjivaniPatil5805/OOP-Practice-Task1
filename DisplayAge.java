package com.practice;

import java.util.Scanner;

public class DisplayAge {
	
	int age;

	public DisplayAge() {
		
		this.age = 18;
		System.out.println("Age for non-parameterised constructor = "+age);
		
	}
	
	public DisplayAge(int age) {
		
		this.age = age;
		System.out.println("Age for parameterised constructor = "+age);
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age for parameterised constructor : ");
		int age = sc.nextInt();
		
		DisplayAge d1 = new DisplayAge();
		DisplayAge d2 = new DisplayAge(age);	
		
		
	}
	
}
