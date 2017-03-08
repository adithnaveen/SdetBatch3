package com.fannie;

public class Customer {
	private int cId;
	private Name name;
	private double sal;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("this will be last method to invoked ");
	}
	
	
	
}
