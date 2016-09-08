package com.eswar.restfirst.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.eswar.restfirst.messenger.database.DatabaseClass;
import com.eswar.restfirst.messenger.model.Message;

public class MessageService {
	
private static Map<Long,Message> messages=DatabaseClass.getMessages();

public MessageService(){
	messages.put(1L,new Message(1L,"Hello World","Eswar"));
	messages.put(2L,new Message(2L,"Hello Jersy","Eswar"));
}

public static List<Message> getAllMessages(){
	return new ArrayList<Message>(messages.values());
}
public static Message getMessage(int i){
	return messages.get(i);
	}


public Message addMessage(Message message){
	message.setId((long) (messages.size()+1));
	messages.put(message.getId(), message);
	return message;
}
public Message updateMessage(Message message){
	if(message.getId()<=0){
		return null;
	}
	messages.put(message.getId(),message);
	return message;
}
public Message removeMessage(Long id){
	return messages.remove(id);
}
}

