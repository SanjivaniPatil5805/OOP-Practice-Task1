package com.practice;

public class Product {

	private String productName;
	private double productPrice;
	private int discount;

	public void setProductName(String productName) {

		this.productName = productName;

	}

	public void getProductName() {

		System.out.println("Product Name = "+productName);

	}

	public void setProductPrice(double productPrice) {

		this.productPrice = productPrice;

	}

	public void getProductPrice() {

		System.out.println("Product Price before discount = "+productPrice);

	}

	public void setDiscount(int discount) {

		this.discount = discount;

	}

	public void getDiscount() {

		System.out.println("Discount = "+discount+"%");
		
		productPrice = productPrice - (productPrice * discount / 100);
		
		System.out.println("Product Price After Discount = "+productPrice);

	}

}
