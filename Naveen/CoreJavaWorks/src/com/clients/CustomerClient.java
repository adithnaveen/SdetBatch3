package com.clients;

import com.fannie.Customer;
import com.fannie.Name;

public class CustomerClient {
	public static void main(String[] args) {
		Runtime.runFinalizersOnExit(true);
		
		System.gc();
		
		Runtime.getRuntime().gc();
		
		
		Customer cust = new Customer();
		cust.setcId(101);
		Name name = new Name();
		
		name.setfName("Peter");
		name.setlName("Harry");
		cust.setName(name);
		
		cust.setSal(10000);
		
		System.out.println(cust);
	
		
		Customer cust1 = new Customer();
		 new Customer();
		 new Customer();
		 new Customer();
		 new Customer();
		
	}
}
