package com.fannie.beans;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class DeleteFromMain {
	public void deleteMessageTest(){
		// msg received from the rest 
		// "Message Deleted "+ messageId;
		// delete method takes only 1 path param 
		int messageId  = 102;
		given()
			.pathParam("messageId", messageId)
		.when()
			.delete("/message/{messageId}")
		.then()
			.statusCode(200)
			.body("message", is("Message Deleted "+messageId));
	}

	public static void main(String[] args) {
		new DeleteFromMain().deleteMessageTest();
	}
}
