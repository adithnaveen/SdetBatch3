package com.fannie.db;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fannie.dbworks.EmpBean;
import com.fannie.dbworks.EmployeeDB;

public class DBTest {

	static EmployeeDB edb = null;
	static EmpBean bean  = null;
	
	@BeforeClass
	public static void empObjInit(){
		System.out.println("Before Class called.... ");
		 edb = new EmployeeDB();
		bean = new EmpBean();
	}
	
	@AfterClass
	public static void empObjeDestory(){
		System.out.println("<<<<<<<<<<<<< AFter class called... ");
		
	}
	
	@Before
	public void beforeAllMethods(){
		System.out.println("hi i'm from Before... ");
	}
	
	@After
	public void afterAllMethods(){
		System.out.println("hi i'm from After>>>>");
	}
	
	// to make the method as test case, it has to be annotated by 
	@Test(timeout=500)
	public void insertEmployeePassTest() {
		// all your test goes here 
		assertEquals("Testing to Check Employee Pass", 
					true, edb.insertEmployee(bean));
	}
	@Test
	public void insertEmployeeFailTest() {
		// all your test goes here 
		
		assertNotEquals("Testing to Check Employee Fail", 
					false, edb.insertEmployee(bean));
	}
}
