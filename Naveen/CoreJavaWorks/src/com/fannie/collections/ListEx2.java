package com.fannie.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		System.out.println("size " + list.size());
		list.add("hello");
		list.add("how");
		list.add("are");
		list.add("you");
		System.out.println("After adding size " + list.size());
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.add("india");
		list.add("america");
		list.add("africa");
		list.add("Japan");
		
		System.out.println(list);
		
		List<String> newList= list.subList(3, list.size());
		
		
		System.out.println("new list -> " + newList);
		
		String [] arr = (String[]) newList.toArray(new String[newList.size()]);
		
		System.out.println("as string ----- ");
		for(String temp : arr){
			System.out.println(temp);
		}

		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			String temp = itr.next();
			
			System.out.println(temp);
		}
		System.out.println("--------------------------");
		
		for(String temp : list){
			System.out.println(temp);
		}
		
	}
}
