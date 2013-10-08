package com.mailgun.api.resources;

import com.mailgun.api.MailGunClient;
import com.mailgun.api.MailGunResponse;
import com.mailgun.api.exceptions.InvalidCredentials;
import com.mailgun.api.exceptions.MailGunException;
import com.mailgun.api.exceptions.MissingEndpoint;
import com.mailgun.api.exceptions.MissingRequiredParameters;
import com.sun.jersey.api.client.ClientResponse;

import javax.ws.rs.core.MultivaluedMap;

public abstract class Resource {
	
	private MailGunClient client;
	protected MultivaluedMap<String, String> filters;
	private boolean loaded;
	
	public Resource(MailGunClient client) {
		this.client = client;
	}
	
	protected MailGunClient getClient() {
		return this.client;
	}
	
	protected boolean isLoaded() {
		return this.loaded;
	}
	
	protected void load(MultivaluedMap<String, String> params) throws Exception {
		String path = this.getResourceLocation();
		ClientResponse response = this.getClient().getService().path(path).queryParams(params).get(ClientResponse.class);
		this.parseResponse(response);
		this.loaded = true;
	}

	public void checkStatusCode(MailGunResponse response) throws MailGunException {

		int statusCode = response.getStatusCode();

		if (statusCode == 200) return;
		if (statusCode == 400) {
			throw new MissingRequiredParameters("Invalid Parameters", response);
		}
		else if (statusCode == 401) {
			throw new InvalidCredentials("Invalid Credentials", response);
		}
		else if (statusCode == 404) {
			throw new MissingEndpoint("Missing / Bad Endpoint", response);
		}
	}

	protected abstract String getResourceLocation();
	protected abstract void parseResponse(ClientResponse response) throws Exception;

}
