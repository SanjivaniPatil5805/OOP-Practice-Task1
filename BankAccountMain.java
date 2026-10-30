package com.practice;

import java.util.Scanner;

public class BankAccountMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Balance :");
		double balance = sc.nextDouble();
		
		System.out.println("Enter deposit amount : ");
		double amount1 = sc.nextDouble();
		
		System.out.println("Enter withdraw amount :");
		double amount2 = sc.nextDouble();
		
		BankAccount b = new BankAccount();
		
		b.setBalance(balance);
		System.out.println("Account Balance before Deposit and Withdraw "+b.getBalance());
		
		b.deposit(amount1);
		b.withdraw(amount2);		
		b.currentBalance();
		
		sc.close();
		
	}

}
