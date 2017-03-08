package com.fannie.exception;

public class Ex2 {
	public static void main(String[] args) {
		try{
			int [] arr = new int[4];
		}catch(RuntimeException re){
			re.printStackTrace();
		}finally{
			System.out.println("hi i'm from finally... ");
		}
		
		System.out.println("Some thing is there... ");
	}
}
