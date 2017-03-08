package com.fanie.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fannie.entity.Message;

/**
 * 
 * @author Naveen Kumar K S
 * @since Feb 2017 
 * @version 1.0 
 * @see This program is the service program to set values to the map, 
 *      initially set with two values, this program has CRUD operation 
 *      which will be invoked by MessageResource
 *      Assume that You are retrieving the data from DB 
 *
 */

public class MessageService {
	Map<Long, Message> messages = new HashMap<Long, Message>();
	
	public MessageService(){
		System.out.println("Constructor invoked for Message Service... ");

		Message m1 = new Message();
		m1.setMessageId(101);
		m1.setMsg("Hello There");
		m1.setAuthor("Naveen");
		
		Message m2 = new Message();
		m2.setMessageId(102);
		m2.setMsg("Hello There....");
		m2.setAuthor("Kanchan");
		
		
		messages.put(101L, m1);
		messages.put(102L, m2);
	}

	public Message getMessage(long messageId){
		return messages.get(messageId);
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message insertMessage(Message message){
		messages.put( (long)message.getMessageId(), message);
		return message;
	}
	
	public Message updateeMessage(Message message){
		
		messages.put( (long)message.getMessageId(), message);
		return message;
	}

	public String deleteMessage (long messageId){
		if(this.getMessage(messageId)!=null){
			messages.remove(messageId);
			return "Message Deleted "+ messageId;
		}else{
			return "Sorry Message Not Found: " + messageId;
		}
	}
}





