package com.fannie.abstracts;

// in abstract class you can have abstract methods 
public abstract  class Figure {
	public final double PI=3.14;
	public abstract void area();
	
	public void draw(){
		System.out.println("Can be drawn with pen/pencil");
	}
}

class Rectangle extends Figure{
	private int len;
	private int bre;
	
	public Rectangle(int len, int bre) {
		this.len = len;
		this.bre = bre;
	}

	@Override
	public void area() {
		System.out.println("Area is (lxb)" + (len * bre));
	}
}

class Circle extends Figure{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		System.out.println("Area of Circle (PI * R * R)" 
				+ (PI * radius * radius));
	}
}

