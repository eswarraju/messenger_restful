package com.eswar.restfirst.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.eswar.restfirst.messenger.model.Message;
import com.eswar.restfirst.messenger.service.MessageService;

@Path("/messages")

public class MessageResource {
	
@GET
@Produces(MediaType.APPLICATION_XML)
public Message getMessage(){
	return MessageService.getMessage(1);
}
/*public List<Message> getMessages(){
	return MessageService.getAllMessages();
}*/
/*
@GET
@Path("/{messageId}")
@Produces(MediaType.APPLICATION_XML)
public Message getMessage(@PathParam("messageId")long id){
	return MessageService.getMessage(id);

}
*/
}