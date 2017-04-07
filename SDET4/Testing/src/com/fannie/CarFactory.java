package com.fannie;


interface Cars{
	String BMW="bmw";
	String AUDI = "audi";
}


class Car{
	
	public static Car getCar(String carName){
		if(carName.equals("audi")){
			return new Audi();
		}else if(carName.equals("bmw")){
			return new BMW();
		}else{
			return new Ford();
		}
	}
	
}

class Audi extends Car {
	public Audi() {
		System.out.println("Audi car created ");
	}
}
class BMW extends Car{}
class Ford extends Car{}

public class CarFactory {
	public static void main(String[] args) {
		Car c = Car.getCar(Cars.AUDI);
	}
}
