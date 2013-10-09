package com.mailgun.api;

import com.google.gson.Gson;
import com.mailgun.api.exceptions.MailGunException;
import com.mailgun.api.resources.instances.MessageInstance;
import com.mailgun.api.resources.lists.Bounces;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MultivaluedMap;


public class MailGunExample {

	public static void main (String args[]) throws Exception, MailGunException {

    	// test mailgun api key
		MailGunClient client = new MailGunClient("key-3ax6xnjp29jd6fds4gc373sgvjxteol0","samples.mailgun.org");

		String to = "";
		String from = "";
		String subject = "hello";
		String body = "yep";

		Email email = new Email(to, from, body, subject);
		MessageInstance msg = client.sendSimpleEmail(email);
		System.out.println(msg.getResponse());

	}
}

