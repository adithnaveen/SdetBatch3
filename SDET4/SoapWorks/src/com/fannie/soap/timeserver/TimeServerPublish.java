package com.fannie.soap.timeserver;

import javax.xml.ws.Endpoint;

public class TimeServerPublish {
	public static void main(String[] args) {
		String publicAddress ="http://127.0.0.1:9876/fannie";
		Endpoint.publish(publicAddress, new TimeServerImp());
		
		System.out.println("You have public successfully");
		System.out.println("Published on " + publicAddress);
		System.out.println("WSDL " + publicAddress+"?WSDL");
	}
}
