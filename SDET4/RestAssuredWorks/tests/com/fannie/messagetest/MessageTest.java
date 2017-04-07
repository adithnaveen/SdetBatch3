package com.fannie.messagetest;

import static com.jayway.restassured.RestAssured.when;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.is;
import static com.jayway.restassured.RestAssured.given;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.fannie.beans.Message;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;

public class MessageTest {

	@BeforeClass public static void init(){
		RestAssured.baseURI ="http://localhost:9090/RestWorks/resources";
	}

	
	@Ignore
	public void googleTest() {
		given().when().get("http://google.com").then().statusCode(200);
	}

	@Test
	public void getMessagesTest(){
		
		when()
			.get("/message")
		.then()
			.statusCode(200)
			.body("", is(empty()));
	}
	
	

	@Test(timeout=100)
	public void postMessageSimpleTest(){	
		// version 1.0 for testing only the posting of the job 
		/*
		 * {
			"messageId": 101
			"msg": "Hello There"
			"author": "Naveen"
			}
		 */
		Message message= new Message(1223, "Sapna", "I like writing java");

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
	
	@Test
	public void getMessageTest(){
		
		Message message = new Message();
		message.setMsg("Hello There");
		message.setMessageId(101);
		message.setAuthor("Naveen");
		
		given()
			.pathParam("messageId", message.getMessageId())
		.when()
			.get("/message/{messageId}")
		.then()
			.statusCode(200)
			.body("messageId", is(message.getMessageId()))
			.body("msg", is(message.getMsg()))
			.body("author", is(message.getAuthor()));
	}
	

	@Test
	public void postCompeleted(){
		Message message= new Message(222, "Aprajita",
				"I like JEE ");
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
		
		given()
		.pathParam("messageId", message.getMessageId())
	.when()
		.get("/message/{messageId}")
	.then()
		.statusCode(200)
		.body("messageId", is(message.getMessageId()))
		.body("msg", is(message.getMsg()))
		.body("author", is(message.getAuthor()));
	}
	

	@Test
	public void updateMesageTest(){
		/*{
			"messageId": 101
			"msg": "Hello There"
			"author": "Naveen"
			}
		*/
		Message updateMessage = new Message(101,
					"Hello Here and there and again somewhere",
					"Naveen Kumar");
		
		given()
			.contentType(ContentType.JSON)
			.body(updateMessage)
		.when()
			.put("/message")
		.then()
			.statusCode(200)
			.body("msg", is(updateMessage.getMsg()))
			.body("author", is(updateMessage.getAuthor()));
		
	}

	@Test
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

	
}
