package com.mailgun.api.Resources;

import com.mailgun.api.MailGunClient;
import com.mailgun.api.domain.Paging;
import com.sun.jersey.api.client.ClientResponse;

import javax.ws.rs.core.MultivaluedMap;
import java.util.List;

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
	
	protected void load(MultivaluedMap<String, String> params) {
		String path = this.getResourceLocation();
		ClientResponse response = this.getClient().get(path, params);
		this.parseResponse(response);
		this.loaded = true;
	}

	protected abstract String getResourceLocation();
	protected abstract void parseResponse(ClientResponse response);
	protected abstract List getItems();
	protected abstract Integer getTotalCount();
	protected abstract Paging getPaging();
	
}
