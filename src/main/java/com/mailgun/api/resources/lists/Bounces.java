package com.mailgun.api.resources.lists;

import com.google.gson.annotations.SerializedName;
import com.mailgun.api.Endpoints;
import com.mailgun.api.MailGunClient;
import com.mailgun.api.resources.ListResource;
import com.mailgun.api.domain.Bounce;
import com.mailgun.api.domain.Paging;

import javax.ws.rs.core.MultivaluedMap;
import java.util.List;

public class Bounces extends ListResource<Bounce> {

	@SerializedName("total_count")
	Integer totalCount;
	@SerializedName("items")
	List<Bounce> items;

	public Bounces(MailGunClient client){
		super(client);
	}
	
	public Bounces(MailGunClient client, MultivaluedMap<String, String> filters) {
		super(client, filters);
	}
	
	@Override
	protected Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public void setItems(List<Bounce> items) {
		this.items = items;
	}

	@Override
	protected String getResourceLocation() {
		return Endpoints.BOUNCES;
	}
	
	@Override
	protected List<Bounce> getItems() {
		return this.items;
	}

	@Override
	protected Paging getPaging() {
		return null;
	}
}
