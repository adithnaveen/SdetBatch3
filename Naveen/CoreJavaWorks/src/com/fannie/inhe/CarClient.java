package com.fannie.inhe;

public class CarClient {
	public static void main(String[] args) {
		Car bmw = new Car("BMW");
		

		System.out.println(bmw.getMake());
		bmw.steering();
		bmw.move();
		System.out.println("-------------------");
		
		Jeep audiJeep = new Jeep("Audi", 2);
		audiJeep.move();
		audiJeep.steering();
		System.out.println(audiJeep.getDoors());
		System.out.println(audiJeep.getModel());
		
		
	}
}
