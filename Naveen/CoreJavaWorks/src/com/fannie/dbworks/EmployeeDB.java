package com.fannie.dbworks;


// CRUD 
public class EmployeeDB {
	public boolean insertEmployee(EmpBean bean){
		// Your DB stuffs will go here 
		
		// simulation it is connection to DB and doing 
		// some operation 
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}
	
	
	public EmpBean getEmployee(){
		// null 
		return new EmpBean();
	}
}
