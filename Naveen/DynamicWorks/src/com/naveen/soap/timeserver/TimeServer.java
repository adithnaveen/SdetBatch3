package com.naveen.soap.timeserver;

import javax.jws.WebMethod;
import javax.jws.WebService;

/** 
*  All Contracts will go her 
*
*/

@WebService
public interface TimeServer {
	
	@WebMethod
	public String getTimeAsString();
	
	@WebMethod
	public String getTimeFromServer();
	
	@WebMethod
	public String getTicketFare(String src, String dest);
}
