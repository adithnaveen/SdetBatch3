package com.naveen.soap.timeserver;

import java.util.Date;

import javax.jws.WebService;

/** 
*  This class is the implementation of the interface (which was contract)
*  this class will have endpointInterface which is the implementation and 
*  Logical name which is port number, serviceName and the target name space 
*  which will be shown in WSDL 
*
*/
@WebService(
		endpointInterface="com.naveen.soap.timeserver.TimeServer",
		name="TimeServicePort",
		portName="TimeServicePort",
		serviceName="TimeServerService",
		targetNamespace="urn:nav.timeserver/ws"
		)
		
		
		
public class TimeServerImpl implements TimeServer {

	@Override
	public String getTimeAsString() {
		return "Time is : " + new Date().toString();
	}

	@Override
	public String getTimeFromServer() {
		return "Time is " + new Date();
	}

	@Override
	public String getTicketFare(String src, String dest) {
		if(src.equalsIgnoreCase("blr") && dest.equalsIgnoreCase("del")){
			// you can connect to DB to get this information
			return "Ticket Fare is " + 20000;
		}
		
		return "Details not found for " + src +", " + dest;
	}
}
