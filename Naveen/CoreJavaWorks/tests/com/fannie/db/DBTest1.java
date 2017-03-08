package com.fannie.db;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import com.fannie.dbworks.EmpBean;
import com.fannie.dbworks.EmployeeDB;

public class DBTest1 {

	static EmployeeDB edb = null;
	static EmpBean bean  = null;
	
	@BeforeClass
	public static void empObjInit(){
		System.out.println("Before Class called.... ");
		 edb = new EmployeeDB();
		bean = new EmpBean();
	}
	@Test
	public void getEmployeeNotNullTest() {
		assertNotNull("Expect Not null after getting employee", edb.getEmployee());
	}

	@Test
	public void getEmployeeNullTest(){
		assertNull("Expect Null after getting Employee", edb.getEmployee());
	}
}
