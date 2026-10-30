package com.practice;

import java.util.Scanner;

public class Book {
	
	String title;
	double price;
	
	public Book(String title, double price) {
		
		this.title = title;
		this.price = price;			
		
	}
	
	public void display() {
		
		System.out.println("Book Title = "+title);
		System.out.println("Bok Price = "+price);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Book Title :");
		String title = sc.nextLine();
		
		System.out.println("Enter Book Price :");
		double price = sc.nextDouble();
		
		Book b = new Book(title, price);
		
		b.display();
		
		sc.close();
		
	}

}
