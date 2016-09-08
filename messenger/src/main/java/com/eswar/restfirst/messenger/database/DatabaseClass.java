package com.eswar.restfirst.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.eswar.restfirst.messenger.model.Message;
import com.eswar.restfirst.messenger.model.Profile;

public class DatabaseClass {
	
	public static Map<Long,Message> messages=new HashMap();
	public static Map<Long,Profile> profiles=new HashMap();
	
	public static Map<Long,Message> getMessages() {
		
     return messages;
	}
	public static Map<Long,Profile> getProfiles() {
		
	     return profiles;
		}

}
