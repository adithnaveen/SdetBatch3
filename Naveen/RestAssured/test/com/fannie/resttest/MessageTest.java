package com.fannie.resttest;


import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static com.jayway.restassured.RestAssured.given;


import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.fannie.beans.Message;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class MessageTest {

	@BeforeClass public static void init(){
		RestAssured.baseURI ="http://localhost:9090/DynamicWorks/resources";
	}
	
	
	@Ignore
	// @Test
	public void googleTest() {
		given().when().get("http://google.com").then().statusCode(200);
	}

	
	
	/**
	 * @see This test case will fail whn you have an entry in the rest 
	 * service, as it is expecting empty
	 */
	@Test
	public void getMessagesTest(){
		
		when()
			.get("/message")
		.then()
			.statusCode(200)
			.body("", is(empty()));
	}
	
	

	@Test 
	public void postMessageSimpleTest(){	
		// version 1.0 for testing only the posting of the job 
		/*
		 * {
			"messageId": 101
			"msg": "Hello There"
			"author": "Naveen"
			}
		 */
		Message message= new Message(115, "harsha", "i like writing");

		given()
		.contentType(ContentType.JSON)
		.body(message)
	.when()
		.post("/message")
	.then()
		.statusCode(200)
		.body("messageId", is(message.getMessageId()))
		.body("msg", is(message.getMsg()))
		.body("author", is(message.getAuthor()));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
