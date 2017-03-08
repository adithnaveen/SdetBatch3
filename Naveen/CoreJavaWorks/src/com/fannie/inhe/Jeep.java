package com.fannie.inhe;

public class Jeep extends FourWheeler{
	private String model;
	private int doors;
	
	public Jeep(String model, int doors){
		this.model = model;
		this.doors = doors;
	}

	public String getModel() {
		return model;
	}

	public int getDoors() {
		return doors;
	}

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		
	}
}
