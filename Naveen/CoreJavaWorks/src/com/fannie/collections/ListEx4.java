package com.fannie.collections;

import java.util.Vector;

public class ListEx4 {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(5, 3);
		System.out.println("Initial Capacity " + vec.capacity());
		System.out.println("Initial Size " + vec.size());
		
		vec.add("One");
		vec.add("two");
		vec.add("three");
		vec.add("four");
		vec.add("five");
		vec.add("six");
		vec.add("seven");
		vec.add("eight");
		vec.add("nine");
		vec.add("ten");
		vec.add("eleven");
		vec.add("twelve");

		System.out.println("after Capacity " + vec.capacity());
		System.out.println("after Size " + vec.size());
	}
}
