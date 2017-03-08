package com.fannie.interfaces;

public class PersonalLoan implements Loan{

	int loanAmount;
	public PersonalLoan(int loanAmount){
		this.loanAmount = loanAmount;
	}
	@Override
	public void submitLoan() {
		System.out.println("Personal loan submitted... ");
	}

	@Override
	public void loanAmount() {
		System.out.println("Personal load amount " + loanAmount);
	}

	@Override
	public void foreClosure() {
		System.out.println("Personal loan Fore closure applied");
	}

	@Override
	public void foreClosure(int amount) {
		System.out.println("Personal load fore closure applied with " 
				+ amount);
	}

}
