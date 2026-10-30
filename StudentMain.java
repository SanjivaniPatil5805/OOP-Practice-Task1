package com.practice;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student ID :");
		int id = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Student Name :");
		String name = sc.nextLine();
		
		Student s = new Student();
		
		s.setId(id);
		System.out.println("Student ID is --> "+s.getId());
		
		s.setName(name);
		System.out.println("Student Name is --> "+s.getName());
		
		sc.close();
		
	}
	
}
