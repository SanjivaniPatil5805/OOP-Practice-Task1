package com.practice;

public class Mobile {
	
	private String model;
	private double price;
	
	public Mobile(String model, double price) {
		
		this.model = model;
		this.price = price;
		
	}
	
	public void getDetails() {
		
		System.out.println("Mobile model = "+model);
		System.out.println("Mobile Price = "+price);
		
	}
	
	public void discount(int discount) {
		
		price = price - (price * discount / 100);
		System.out.println("Discounted price = "+price);
		
	}

	
}
