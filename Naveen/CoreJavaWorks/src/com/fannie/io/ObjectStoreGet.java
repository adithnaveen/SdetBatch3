package com.fannie.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStoreGet {

	
	public static void storeObject(Customer cust){
		File f = new File("Customer.ser");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cust);
			oos.writeObject(new Double(333));
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Data Written... ");
	}
	public static void getObject() throws 
		FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream ois = new ObjectInputStream
			(new FileInputStream("Customer.ser"));
		
		
		Customer cust = (Customer) ois.readObject();
		
		System.out.println(cust);
		System.out.println(ois.readObject());
	}
	
	
	
	
	public static void main(String[] args) 
			throws FileNotFoundException, ClassNotFoundException, IOException {
		
		Customer cust = new Customer();
		cust.setCustId(101);
		cust.setCustName("Lee");
		storeObject(cust);
		
		getObject();
	}
	
}













