package com.fannie.inhe;

public class VehicleClient {
	public static void main(String[] args) {
		// array 
		Vehicle [] vehicles = new Vehicle[5];
		
		vehicles[0] = new Car("BMW");
		vehicles[1] = new Jeep("Audi", 2);	
		vehicles[2] = new Car("Toyota");
		vehicles[3] = new Jeep("Audi", 2);
		vehicles[4] = new Jeep("Toyota", 4);

		new VehicleBL().display(vehicles);
	}
}
