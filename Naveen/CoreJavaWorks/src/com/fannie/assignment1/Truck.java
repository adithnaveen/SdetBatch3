package com.fannie.assignment1;

public class Truck extends Vehicle{

	Truck(String color, int wheels) {
		super(color, wheels);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Truck is Moving with " + getColor() 
			+" color " + getWheels() +" wheels");
	}

	@Override
	public void applyBreak() {
		System.out.println("When you apply break on truck reduce by 5 miles/hr ");
		
	}

}
