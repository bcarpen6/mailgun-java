package com.mailgun.api.resources.instances;

import com.google.gson.Gson;
import com.mailgun.api.*;
import com.mailgun.api.resources.InstanceResource;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MediaType;

public class MessageInstance extends InstanceResource {

	MailGunResponse response;
	Email email;

	public MessageInstance(MailGunClient client, Email email) {
		super(client);
		this.response = new MailGunResponse();
		this.email = email;
	}

	public MailGunResponse sendSimple() {
		MultivaluedMapImpl formData = new MultivaluedMapImpl();
		formData.add("from", this.email.getFrom());
		formData.add("to", this.email.getTo());
		formData.add("subject", this.email.getSubject());
		formData.add("text", "test");
		ClientResponse response =  this.getClient().getService().path(this.getResourceLocation()).
				type(MediaType.APPLICATION_FORM_URLENCODED).post(ClientResponse.class, formData);
		parseResponse(response);
		return this.response;
	}

	public MailGunResponse sendMIME(MailGunClient client, Email email) {
		// todo
		return this.response;
	}

	@Override
	protected String getResourceLocation() {
		return Endpoints.MESSAGES;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	protected void parseResponse(ClientResponse response) {
		Gson gson = new Gson();
		this.response = gson.fromJson(response.getEntity(String.class), MailGunResponse.class);
	}

	public MailGunResponse getResponse() {
		return response;
	}

	public void setResponse(MailGunResponse mgr) {
		this.response = mgr;
	}
}
