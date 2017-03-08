package com.fannie.inhe;

// mutable classes are those classes which have setters 
// immutable classes are those which has constructor/s 
// and only getters 


public class Car extends FourWheeler{
	private String model;
	
	public Car(String model){
		this.model = model;
	}
	public String getMake(){
		return model;
	}
	
	
	@Override
	public void steering() {
		System.out.println("BMW has Power Steering....");
	}
	@Override
	public void move() {
		System.out.println("BMW Moves.... ");
	}

	

}
