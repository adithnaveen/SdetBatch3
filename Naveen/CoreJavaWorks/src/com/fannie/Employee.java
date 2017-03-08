package com.fannie;


// in your class if you dont have a constructor 
// if you dont have the contructor in your class 
// then compiler wll create 1 for you 
public class Employee {
	
	public Employee(){}
	
	private int empId;
	private String empName;
	private double empSal;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		if(empName.length()<5){
			System.out.println("sorry name should be min of 4 chars ");
			this.empName = "no name";
		}else{
			this.empName = empName;
		}
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		if(empSal <10000){
			System.out.println("sorry Min Sal to be 10,000");
			this.empSal = 10000;
		}else{
			this.empSal = empSal;
		}
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
}



