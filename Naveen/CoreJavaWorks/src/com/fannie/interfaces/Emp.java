package com.fannie.interfaces;

public class Emp implements Comparable<Emp>{
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
		this.empName = empName;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	public Emp(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public int compareTo(Emp o) {
//		return this.empId - o.getEmpId();
//		return this.empName.compareTo(o.getEmpName());
		// on desc of empname 
		return o.getEmpName().compareTo(this.empName);
	}
	
}







