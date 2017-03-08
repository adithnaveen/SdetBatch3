package com.fannie.interfaces;

import java.util.Arrays;

public class SortPrimitive {
	public static void main(String[] args) {
		int [] nums = new int[7];
		
		nums[0] = 10;
		nums[1] = 12;
		nums[2] = 130;
		nums[3] = 4;
		nums[4] = 410;
		nums[5] = 44;
		nums[6] = 123;
		
		System.out.println("Original list ");
		System.out.println("-----------------------");
		for(int i : nums){
			System.out.println(i);
		}
		
		System.out.println("Sorted List ");
		System.out.println("------------------------");
		Arrays.sort(nums);
		
		for(int i : nums){
			System.out.println(i);
		}
	}
}
