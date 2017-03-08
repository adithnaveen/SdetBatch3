package com.fannie.threads;


// by extending the class from Thread you make it eligble for 
// Asynchronous 
class BusinessLogic extends Thread{
	public void run(){
		for(int i=0; i<=500; i++){
			System.out.println("I Value "+i +" in Thread " + 
						Thread.currentThread().getName());
		}
		System.out.println("Thread " + currentThread().getName() +" Exiting ");
	}
}

// if you have main method in the class then its a thread 
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("Name :"+Thread.currentThread().getName());
		// 1 - Min 
		// 5 - Norm (Default) 
		// 10 - Max 
		System.out.println("Priority " + Thread.currentThread().getPriority());
		
		// invoking the method TODO my job 
		BusinessLogic bl = new BusinessLogic();
		// when you make a request for start() then the OS level thread 
		// is created and the control is given to special method 
		// called public void run(){}, thus asynchronous 
		bl.setName("Vinay");
		bl.setPriority(3);
		bl.start();
		
		BusinessLogic b2 = new BusinessLogic();
		b2.setName("Edmund");
		b2.setPriority(10);
		b2.start();
		
		// simulate some time killing in the system 
		for(int i=0; i<=500; i++){
			System.out.println("I Value "+i +" in Thread " + 
						Thread.currentThread().getName());
		}
		
		try {
			bl.join();
			b2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println("Main Exiting... ");
		
	}
}
