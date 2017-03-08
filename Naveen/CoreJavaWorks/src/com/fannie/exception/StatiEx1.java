package com.fannie.exception;

class Testing{
	public static void testMe(){
		System.out.println("Calling Testme... ");
	}
}
public class StatiEx1 {

	public static int add(int a, int b){
		return a + b;
	}
	
	static{
		System.out.println("hi i'm from static block... ");
	}
	static{
		System.out.println("hi i'm second static block... ");
	}
	public static void hi(){
		System.out.println("you called hi");
	}
	public static void main(String[] args) {
		int x = add(11, 22);
		System.out.println(x);
		hi();
		hello();
		Testing.testMe();
	}
	
	
	static{
		System.out.println("i'm after main... ");
	}
	public static void hello(){
		System.out.println("you called hello... ");
	}
}
