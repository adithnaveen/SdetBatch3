package com.fannie.collections;

import java.util.HashSet;

class Device{
	private int dId;
	private String name;
	
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Device(int dId, String name) {
		super();
		this.dId = dId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Device [dId=" + dId + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return this.name.charAt(0);
	}
	@Override
	public boolean equals(Object obj) {
		Device tmep= (Device) obj;
		return this.dId==tmep.dId && this.name.equals(tmep.getName());
	}
	
	
}


public class SetEx2 {
	public static void main(String[] args) {
		HashSet<Device> devices = new HashSet<Device>();
		
		devices.add(new Device(101, "Laptop"));
		devices.add(new Device(12, "Computer"));
		devices.add(new Device(55, "Projector"));
		devices.add(new Device(445, "Presentor"));
		
		devices.add(new Device(101, "Laptop"));
		
		
		for(Device temp : devices){
			System.out.println(temp +", " + temp.hashCode());
		}
		
		
	}
}







