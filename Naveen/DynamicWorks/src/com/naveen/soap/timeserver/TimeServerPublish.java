package com.naveen.soap.timeserver;

import javax.xml.ws.Endpoint;
// The publisher will host it on the spcipied IP address and the port 
// number, the port number should not be reserved port rather 
// arbitrary 

// in this example once you execute goto to web browser and 
// open http://127.0.0.1:9876/nav?wsdl 


public class TimeServerPublish {
	public static void main(String[] args) {
		String publishAddress = "http://127.0.0.1:9876/nav";
		Endpoint.publish(publishAddress, new TimeServerImpl());
		
		System.out.println("Publish on " + publishAddress);
		System.out.println("WSDL -> " + publishAddress+"?WSDL");
		System.out.println("Published Successfully... ");
	}
}
