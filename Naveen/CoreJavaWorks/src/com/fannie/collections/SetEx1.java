package com.fannie.collections;

import java.util.HashSet;

public class SetEx1 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Andy");
		set.add("Amit");
		set.add("Aan");
		set.add("Becky");
		set.add("Andy");

		System.out.println(set);
		for(String temp: set){
			System.out.println(temp.hashCode());
		}
	}
}
