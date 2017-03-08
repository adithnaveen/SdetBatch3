package com.fannie.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;



@Path("/hello")
public class HelloResource {
	
	@GET
	@Produces("text/html")
	public String sayHello(){
		return "<html><body><h2>Welcome To RESTfull Services</h2></body></html>";
	}
	
//	@GET
//	@Produces("application/xml")
//	public String sayHelloAsXml(){
//		return "<?xml version='1.0'?><message>Hello World!!!</message>";
//	}
/*
	@GET
	@Produces({"application/json"})
	public Greeting sayHello(){
		return new Greeting("Harsha", "Hello World!!!");
	}
	*/
	
	
	
	
}