package com.fannie;

interface MyCar {
	String BMW = "BMW";
	String NEXUS = "NEXUS";
	String AUDI = "AUDI";

}

public class Car {

	public static  Car getMyCar(String carName) {
		if (carName.equals("BMW")) {
			return new BMW();
		} else if (carName.equals("AUDI")) {
			return new Audi();
		} else if (carName.equals("NEXUS")) {
			return new Nexus();
		}
		
		return null;
	}

}

class BMW extends Car {

	public BMW() {
		System.out.println("Bmw constructor ");
	}
}

class Audi extends Car {
	public Audi() {
		System.out.println("AUDI Construtor ");
	}

}

class Nexus extends Car {

	public Nexus() {
		System.out.println("nexus constructor... ");
	}
}