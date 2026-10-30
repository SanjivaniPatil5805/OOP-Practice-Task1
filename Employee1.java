package com.practice;

public class Employee1 {

	private double salary;

	public void setSalary(double salary) {

		if (salary > 0) {

			this.salary = salary;

		}

	}

	public void getSalary() {

		if (salary > 0) {

			System.out.println("Salary = "+salary);

		} else {

			System.out.println("Error ..!");

		}
	}

}
