package com.practice;

import java.util.Scanner;

public class Multiply {

	public int multiply(int a, int b) {
		
		return a * b;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Multiply m = new Multiply();
		
		System.out.println("Multiplication = "+m.multiply(a, b));
		
		sc.close();
		
	}
	
}
