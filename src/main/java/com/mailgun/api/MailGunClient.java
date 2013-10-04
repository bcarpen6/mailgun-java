package com.mailgun.api;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;

import java.net.URI;

public class MailGunClient {

    private String domain;

	private String apiEndpoint = "api.mailgun.net";
	public static final String API_VERSION = "v2";
	
	protected Client client;
	protected WebResource service;
	
	public MailGunClient(String apiKey, String domain) {
        this.domain = domain;
		this.client = Client.create();
		this.client.addFilter(new HTTPBasicAuthFilter("api", apiKey));
		this.service = this.client.resource(getBaseUri());
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
}
