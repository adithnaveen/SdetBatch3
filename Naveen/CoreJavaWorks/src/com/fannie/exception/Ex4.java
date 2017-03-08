package com.fannie.exception;

import java.io.IOException;

// to show working of checked exception 


public class Ex4 {

	public static void submitLoan(String loanType, 
			String custName, int amount) throws IOException{
		
		if(amount < 10000){
			throw new IOException("Sorry Loan Not "
					+ "process becase of low amount applied");
		}
		
	}
	
	
	public static void main(String[] args) {
		try {
			submitLoan("Home", "Scott", 2000);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
