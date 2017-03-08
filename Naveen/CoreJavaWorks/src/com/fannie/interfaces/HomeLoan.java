package com.fannie.interfaces;

public class HomeLoan implements Loan{
	
	int loanAmount;
	
	public HomeLoan(int loanAmount){
		this.loanAmount = loanAmount;
	}
	
	@Override
	public void submitLoan() {
		System.out.println("Home loan submitted... ");
	}

	@Override
	public void loanAmount() {
		System.out.println("Home Loan Amount is " + loanAmount );
	}

	@Override
	public void foreClosure() {
		System.out.println("Home Loan fore closure applied");
	}

	@Override
	public void foreClosure(int amount) {
		System.out.println("Home Loan fore closure applied with " 
				+ amount);
	}
}
