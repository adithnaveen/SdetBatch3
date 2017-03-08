package com.fannie.exception;

public class Ex3 {

	public static void checkName(String name){
		if(name.length()<4){
			throw new RuntimeException("Sorry name cannot be less than 4 chars");
		}
	}
	
	public static void checkSalary(int salary, String name) {
		try{
			checkName(name);
		if (salary < 10000) {
			throw new ArithmeticException("sorry salary is less, for "
					+ name + " given " + salary);
		} else {
			System.out.println("Salary under process " 
					+ name + ", " + salary);
		}
		}catch(RuntimeException re){
			throw new 
			RuntimeException("Sorry checking salary not done",
					re);
		}
	}

	public static void main(String[] args) {
		checkSalary(1000, "Pet");
	}
}
