package com.fannie.interfaces;

import java.util.Comparator;

public class EmpSorter implements Comparator<Emp>{
	// asc order of sal 
	@Override
	public int compare(Emp o1, Emp o2) {
		return (int) (o1.getEmpSal()-o2.getEmpSal());
	}
}