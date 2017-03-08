package com.fannie.interfaces;

import java.util.Arrays;

public class SortString {
	public static void main(String[] args) {
		String [] strs =  {"hello", "how", "are", "you","today"};
		
		
		Arrays.sort(strs);
		for(String temp: strs){
			System.out.println(temp);
		}
	}
}
