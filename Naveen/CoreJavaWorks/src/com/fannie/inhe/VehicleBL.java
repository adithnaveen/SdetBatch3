package com.fannie.inhe;

public class VehicleBL {
	public void display(Vehicle[] vehicles){

		for(Vehicle temp : vehicles){
			System.out.println("---------------");
			temp.move();
			((FourWheeler)temp).steering();

			if(temp instanceof Car){
				System.out.println("Car make :"
						+((Car) temp).getMake());
			
			}else if(temp instanceof Jeep){
				System.out.println("Jeep Doors : "+
						((Jeep) temp).getDoors());
				
				System.out.println("Jeep Model " + 
						((Jeep) temp).getModel());
			}
		}
	}
}
