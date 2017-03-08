package com.fannie.collections;

import java.util.ArrayList;

// is to show generic collection 
public class ListEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("hi");
		list.add(133);
		list.add(true);
		list.add(new Object());
		
		for(Object temp : list){
			System.out.println(temp);
		}
		
	}
}
