package com.practice;

import java.util.Scanner;

public class ProductMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Name : ");
		String productName = sc.next();
		
		System.out.println("Enter product Price : ");
		double price = sc.nextDouble();
		
		System.out.println("Enter discount Percentage :");
		int discount = sc.nextInt();
		
		Product p = new Product();
		
		p.setProductName(productName);
		p.setProductPrice(price);
		p.setDiscount(discount);
		
		p.getProductName();
		p.getProductPrice();
		p.getDiscount();
		
		sc.close();
		
	}

}
