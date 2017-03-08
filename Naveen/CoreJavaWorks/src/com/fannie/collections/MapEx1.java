package com.fannie.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Sunitha", 10000);
		map.put("Lyndon", 12000);
		map.put("Ryan", 20000);
		
//		System.out.println(map.get("Ryan"));
//		
//		map.put("Ryan", 22000);
//		System.out.println(map.get("Ryan"));
		
		
		Set set = map.entrySet();
		// iterator's start from -1 
		Iterator itr = set.iterator();
		
		while(itr.hasNext()){
			Map.Entry<String, Integer> temp = 
					(Entry<String, Integer>) itr.next();
			
			System.out.println(temp.getKey() +", " + temp.getValue());
		}
		
//		Integer -> Number -> Object 
//		Car -> FourWheeler -> Vehicle
		Integer i;
		
		
		
		
		
		
		
		
		
	}
}
