package com.fannie.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.fanie.service.MessageService;
import com.fannie.entity.Message;

@Path("/message")
public class MessageResource {
	static MessageService messageService = new MessageService();
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId) {
		// Assuming we get the details from the Db

		Message message = messageService.getMessage(messageId);
		return message;
	}
	
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message postMessage(Message message) {
		return messageService.insertMessage(message);
	}
	

	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Message updateMessage(Message message) {
		return messageService.updateeMessage(message);
	}

	@DELETE
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteMessage(@PathParam("messageId") long messageId) 
			throws JSONException {
		String message =   messageService.deleteMessage(messageId);

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", message);
		
		return Response.status(200).entity(jsonObject.toString()).build();
	}

}
