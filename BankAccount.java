package com.practice;

public class BankAccount {
	
	private double balance;
	
	public void setBalance(double balance) {
		
		this.balance = balance;
		
	}
	
	public double getBalance() {
		
		return balance;
		
	}
	
	public void deposit(double amount) {
		
		System.out.println("Deposit Amount = "+amount);
		balance = balance + amount;
	
	}
	
	public void withdraw(double amount) {
		
		System.out.println("Withdraw Amount = "+amount);
		balance = balance - amount;
		
	}
	
	public void currentBalance() {
		
		System.out.println("Account Balance after Deposit and  Withdraw = "+balance);
		
	}
	
	

}
