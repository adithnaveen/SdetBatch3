package com.fannie.soap.timeserver;

import javax.jws.WebService;

// this class will implement the interface with 
// is contracted to end user 
// this class shall have implementation, and endpoint 
// which shall be given to enduser and additional details 
// of webservices like port, name, serviceName etc etc 

@WebService(
			endpointInterface="com.fannie.soap.timeserver.ITimeServer", 
			name="TimeServer", 
			portName="TimeServerPort", 
			serviceName="TimeServerService", 
			targetNamespace="urn:fannie.timeserver/ws"
		)
public class TimeServerImp implements ITimeServer {

	@Override
	public String checkCreditScore(String name, int score) {
		if(score < 400){
			return "Sorry Mr/Ms/Mrs" + name +" you cannot have loan";
		}else if(score>=400 && score < 700){
			return "You have avg Credit Score Mr/Ms/Mrs "+
					name +" you can get max of 1 million";
		}else{
			return "You are good to have loan pls talk to us Mr/Ms/Mrs "+ name;
		}

	}

	@Override
	public String getAddress() {

		return "Reston, VA";
	}

	@Override
	public int getPrice(String from, String to) {
		return 1000;
	}

}