package com.practice;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Car Brand :");
		String brand = sc.next();
		
		System.out.println("Enter Car Price :");
		double price = sc.nextDouble();
		
		Car c = new Car();
		
		c.setBrand(brand);
		c.setPrice(price);
		
		System.out.println("Car Brand = "+c.getBrand());
		System.out.println("Car Price = "+c.getPrice());
		
		sc.close();
		
	}
	
}
