package com.practice;
import java.util.Scanner;

public class MobileMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter mobile model :");
		String model = sc.nextLine();
		
		System.out.println("Enter mobile  price : ");
		double price = sc.nextDouble();
		
		System.out.println("Enter discount in percentage : ");
		int discount = sc.nextInt();
		
		Mobile m = new Mobile(model, price);
		
		m.getDetails();
		m.discount(discount);
		
		sc.close();
		
	}
	
}
