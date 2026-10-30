package com.practice;

import java.util.Scanner;

public class EvenOdd {

	public boolean isEven(int n) {
		
		if(n % 2 == 0) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		EvenOdd e = new EvenOdd();
		
		if(e.isEven(n) == true) {
			
			System.out.println("Even Number.");
			
		} else {
			
			System.out.println("Odd Number. ");
			
		}
		
		sc.close();
		
	}
	
}
