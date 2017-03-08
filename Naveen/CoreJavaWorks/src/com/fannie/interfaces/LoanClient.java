package com.fannie.interfaces;

public class LoanClient {
	public static void main(String[] args) {
		Loan [] loans = new Loan[4];
		loans[0] = new HomeLoan(10000);
		loans[1] = new PersonalLoan(20000);
		loans[2] = new HomeLoan(30000);
		loans[3] = new PersonalLoan(40000);
		
		
		for(Loan temp : loans){
			System.out.println("================================");
			temp.loanAmount();
			temp.foreClosure();
		}
		
	}
}
