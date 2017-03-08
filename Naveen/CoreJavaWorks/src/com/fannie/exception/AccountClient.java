package com.fannie.exception;

public class AccountClient {
	public static void main(String[] args) {
		Account [] accs = new Account[4];
		accs[0] = new Account(1000);
		accs[1] = new Account(4455);
		accs[2] = new Account(1122);
		accs[3] = new Account(5512);
		
		for(Account temp : accs){
			System.out.println(temp.getAccId() 
						+", " + temp.getBalance());
		}
	}
}
