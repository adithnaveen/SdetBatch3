package com.fannie.collections;

import java.util.HashSet;
import java.util.Set;

public class WildCardEx {
	/// this display method should show data from 
	// Integer, Float, Double, Byte, Short 
	public static void display(Set<? extends Number> set){
		for(Number temp : set){
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		Set<Number> set ;
		
		Set<Integer> iSet = new HashSet<Integer>();
		iSet.add(100);
		iSet.add(200);
		iSet.add(300);
		iSet.add(400);
		
		// YOU GOT TO DISPLAY TODO 
		display(iSet);
		
		Set <Double> dSet = new HashSet<Double>();
		dSet.add(2000d);
		dSet.add(3000d);
		dSet.add(4000d);
		
		// YOU GOT TO DISPLAY TODO 
		display(dSet);
	}
	
}
