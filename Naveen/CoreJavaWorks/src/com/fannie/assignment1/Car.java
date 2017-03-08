package com.fannie.assignment1;

public class Car extends Vehicle{
	private boolean abs;
	
	public Car(String color, int wheels, boolean abs){
		super(color, wheels);
		this.abs = abs;
	}

	@Override
	public void move() {
		System.out.println("Car is Moving with "+ getColor() 
			+" color " + getWheels() +" wheels" );
	}

	@Override
	public void applyBreak() {
		System.out.println("When you apply break on car reduce by 10 miles/hr ");
	}
	
	
}
