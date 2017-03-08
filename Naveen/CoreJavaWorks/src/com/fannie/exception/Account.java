package com.fannie.exception;

public class Account {
	private int accId;
	private double balance;
	private static int count=100;
	
	public Account(double balance) {
		this.accId = count ++;
		this.balance = balance;
	}
	public int getAccId() {
		return accId;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
