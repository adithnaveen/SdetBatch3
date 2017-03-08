package com.clients;

import com.fannie.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee emp1;
		emp1 = new Employee();
		
		
		emp1.setEmpId(101);
		emp1.setEmpName("Scott");
		emp1.setEmpSal(1000);
		
		System.out.println(emp1);
	}
}
