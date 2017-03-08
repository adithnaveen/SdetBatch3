package com.fannie.exception;

// by extending the class from exception it becomes 
// eligible to throw 
class FanniException extends Exception{
	private String msg;
	
	FanniException(){
		this.msg = "Fanni Exception Called... ";
	}
	
	FanniException(String msg){
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "::::: " +  this.msg +":::::";
	}
	
	
}

class CitiException extends Exception{
	private String msg;
	CitiException(){
		msg = "City Exception Called... ";
	}
	
	CitiException(String msg){
		this.msg  =msg;
	}
	

	@Override
	public String getMessage() {
		return this.msg;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "::::: " +  this.msg +":::::";
	}
	
	
}



public class UserException {

	public static void applyLoan(String loanType, int creditScore)
				throws CitiException, FanniException{
		
		if(loanType.equalsIgnoreCase("vehicle") && creditScore < 400 ){
			throw new CitiException
				("Sorry Your Credit Score is Less, Vehicle Loan not processed");
			
		}else if(loanType.equalsIgnoreCase("home") && creditScore < 700){
			throw new FanniException
				("Oh your Credit Score too low, please visit bank for more details");
		}
	}
	
	
	public static void main(String[] args) {
		try {
			applyLoan("vehicle", 300);
		} catch (CitiException e) {
			e.printStackTrace();
		} catch (FanniException e) {
			e.printStackTrace();
		}
	}
}















