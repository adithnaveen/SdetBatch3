package com.fannie.interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class EmpSortClient {
	public static void main(String[] args) {
		Emp [] emps = {
				new Emp(101, "Amit", 20000), 
				new Emp(23, "Andy", 33322), 
				new Emp(43, "Becky", 23232), 
				new Emp(88, "Peter", 10000)
		};
		

		System.out.println("Before Sort");
		for(Emp temp : emps){
			System.out.println(temp);
		}
//		Arrays.sort(emps, new EmpSorter());
		
		Comparator<Emp> mycompare = new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return o2.getEmpName().compareTo(o1.getEmpName());
			}
		};
		
		Arrays.sort(emps, mycompare);
		
		System.out.println("---------------------------");
		System.out.println("After Sort");
		for(Emp temp : emps){
			System.out.println(temp);
		}
		
	}
}
