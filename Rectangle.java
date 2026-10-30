package com.practice;

import java.util.Scanner;

public class Rectangle {
	
	double area;
	
	public Rectangle(double width, double breadth) {
		
	 area = width * breadth;
		
	}
	
	public void displayArea() {
		
		System.out.println("Area of Rectangle = "+area);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter width of Rectangle : ");
		double width = sc.nextDouble();
		
		System.out.println("Enter breadth of Rectangle : ");
		double breadth = sc.nextDouble();
		
		Rectangle r = new Rectangle(width, breadth);
		
		r.displayArea();
		
		sc.close();
		
	}

}
