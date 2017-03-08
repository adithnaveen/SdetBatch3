package com.fannie.threads;
class ThirdPartyBusiness{
	public void discount(){
		System.out.println("You run the business with us will give discount");
	}
}
class MyBusiness extends ThirdPartyBusiness implements Runnable{
	Thread t;
	MyBusiness(String name, int priority){
		t = new Thread(this, name);
		t.setPriority(priority);
		// when start is invoked the it creates an OS level 
		// thread and gives control to run()
		t.start();
	}
	public void run() {
		for(int i=0; i<=500; i++){
			System.out.println("I Value "+i +" in Thread " + 
						Thread.currentThread().getName());
		}
		System.out.println("Thread " + 
				Thread.currentThread().getName() +" Exiting ");		
	}
}

public class RunnableEx1 {
	public static void main(String[] args) {
		MyBusiness m1 = new MyBusiness("Electronics", Thread.MAX_PRIORITY);
		m1.discount();
		MyBusiness m2 = new MyBusiness("Juice", Thread.NORM_PRIORITY);
		MyBusiness m3 = new MyBusiness("Pet Bottle", Thread.MIN_PRIORITY);
	}
}








