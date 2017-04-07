package com.fannie;

import com.fannie.beans.Emp;

class Emp1 {
	private int empId;
	private String empName;
	private double empSal;
	
	
	
	public Emp1(){}
	
	public Emp1(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	
}

public class Testing {
	public static void main(String[] args) {
		Emp1 emp1 = new Emp1(101, "harsha", 324343);
		System.out.println(emp1.hashCode());

		Emp1 emp2  = new Emp1();
		System.out.println(emp2.hashCode());
		String str1 = new String("FB");
		System.out.println("str1 -> "+str1.hashCode());
		String str2 = new String("Ea");
		System.out.println("str2 -> " + str2.hashCode());
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
	}
}
