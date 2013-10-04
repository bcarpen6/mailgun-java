package com.mailgun.api.resources;

import com.mailgun.api.MailGunClient;
import com.mailgun.api.domain.Paging;
import com.sun.jersey.api.client.ClientResponse;

import java.util.List;

public class InstanceResource extends Resource {
	
	public InstanceResource(MailGunClient client) {
		super(client);
	}

	@Override
	protected String getResourceLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void parseResponse(ClientResponse response) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected List getItems() {
		return null;
	}

	@Override
	protected Paging getPaging() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Integer getTotalCount() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
