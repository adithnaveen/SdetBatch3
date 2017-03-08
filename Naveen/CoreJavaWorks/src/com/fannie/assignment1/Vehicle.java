package com.fannie.assignment1;

public abstract class Vehicle {
	private String color;
	private int wheels;
	
	
	Vehicle(String color, int wheels){
		this.color = color;
		this.wheels = wheels;
	}
	
	public String getColor() {
		return color;
	}

	public int getWheels() {
		return wheels;
	}

	public abstract void move();
	public abstract void applyBreak();
}
