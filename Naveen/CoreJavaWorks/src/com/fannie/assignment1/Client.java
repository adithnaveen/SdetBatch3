package com.fannie.assignment1;

public class Client {
	public static void main(String[] args) {
		Vehicle[] vehicles = new Vehicle[4];
		
		vehicles[0] = new Car("blue", 4, true);
		vehicles[1] = new Car("white", 4, true);
		vehicles[2] = new Truck("red", 8);
		vehicles[3] = new Car("Green", 4, true);
		
		Road road = new Road();
		
		for(Vehicle temp : vehicles){
			road.move(temp);
			road.slowDown(temp);
		}
		
		
	}
}
