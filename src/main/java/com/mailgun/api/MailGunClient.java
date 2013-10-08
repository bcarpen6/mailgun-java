package com.mailgun.api;

import com.mailgun.api.exceptions.MailGunException;
import com.mailgun.api.resources.instances.MessageInstance;
import com.mailgun.api.resources.lists.Bounces;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.core.util.MultivaluedMapImpl;

import javax.ws.rs.core.MultivaluedMap;
import java.net.URI;

public class MailGunClient {

    private String domain;

	private String apiEndpoint = "api.mailgun.net";
	public static final String API_VERSION = "v2";

	protected WebResource service;
	
	public MailGunClient(String apiKey, String domain) {
        this.domain = domain;
		Client client = Client.create();
		client.addFilter(new HTTPBasicAuthFilter("api", apiKey));
		this.service = client.resource(getBaseUri());
	}

    public Bounces getBounces(MultivaluedMap<String, String> params) {
        return  new Bounces(this, params);
    }

    public Bounces getBounces() {
        return this.getBounces(new MultivaluedMapImpl());
    }

	public MessageInstance sendSimpleEmail(Email email) throws Exception, MailGunException {
		MessageInstance msg = new MessageInstance (this, email);
		msg.sendSimple();
		return msg;
	}
	
	public URI getBaseUri() {
		return URI.create(String.format("https://%s/%s/%s", this.apiEndpoint, API_VERSION, this.domain));
	}

	public String getApiEndpoint() {
		return this.apiEndpoint;
	}

	public void setApiEndpoint(String apiEndpoint) {
		this.apiEndpoint = apiEndpoint;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public WebResource getService() {
		return service;
	}

	public void setService(WebResource service) {
		this.service = service;
	}

}
