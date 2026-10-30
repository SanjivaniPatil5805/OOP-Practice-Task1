package com.practice;

import java.util.Scanner;

public class Addition {
	
	public void add(int a, int b) {
		
		int sum = a + b;
		
		System.out.println("Sum of "+a+" and "+b+" = "+sum);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Addition aa = new Addition();
		
		aa.add(a, b);
		
		sc.close();
		
	}

}
