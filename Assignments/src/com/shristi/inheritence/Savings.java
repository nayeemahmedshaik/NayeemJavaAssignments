package com.shristi.inheritence;

public class Savings extends Bank {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		super.withdraw(amount);
		balance -=amount * 1.01;
	}

	@Override
	void deposit(double amount) {
		super.deposit(amount);
		
	}
	
	
	

}
