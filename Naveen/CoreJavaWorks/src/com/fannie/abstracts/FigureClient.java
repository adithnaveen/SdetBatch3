package com.fannie.abstracts;

class FigureBL{
	public void display(Figure [] figures){
		for(Figure temp : figures){
			temp.area();
			temp.draw();
		}
	}
}

public class FigureClient {
	public static void main(String[] args) {
		Figure [] figures = new Figure[4];
		
		figures[0]= new Rectangle(10, 20);
		figures[1]= new Circle(20);
		figures[2]= new Rectangle(33, 20);
		figures[3]= new Circle(22);
		
		new FigureBL().display(figures);
	}
	
	
}
