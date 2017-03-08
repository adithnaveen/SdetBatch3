package com.fannie.client;

import com.fanine.dao.EmployeeDAO;
import com.fannie.bean.Employee;
import com.fannie.interfaces.IEmployeeDAO;

public class EmpClient {
	public static void main(String[] args) {
		IEmployeeDAO dao = new EmployeeDAO();

			/*System.out.println(dao.insertEmployee(
				new Employee("Harry", 2211, "harry@fanniemae.com")));*/
		
//			
//		System.out.println(
//				dao.deleteEmp(1)
//				);
//
//		System.out.println(dao.updateEmp(3, 44444));
	
	// 	System.out.println(dao.getEmp(2));
		
		
		for(Employee temp : dao.getAllEmps()){
			System.out.println(temp);
		}
		
		
	}


}
