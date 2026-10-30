package com.practice;

import java.util.Scanner;

public class ReturnName{

	String name;

	public String getName() {
		return name;

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name :");
		String name = sc.next();
		
		ReturnName n = new ReturnName();
		
		n.name = name;
		
		System.out.println("Your name is --> "+n.getName());
		
		sc.close();
	}

}
