package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

public class Stat {

	@SerializedName("event")
	public String event;
	
	@SerializedName("total_count")
	public int itemTotalCount;
	
	@SerializedName("created_at")
	public String createdAt;
	
	@SerializedName("tags")
	public Tags tags;
	
	@SerializedName("id")
	public String id;
	
	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public int getItemTotalCount() {
		return this.itemTotalCount;
	}
	public void setItemTotalCount(int itemTotalCount) {
		this.itemTotalCount = itemTotalCount;
	}
	public String getCreatedAt() {
		return this.createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public Tags getTags() {
		return this.tags;
	}
	public void setTags(Tags tags) {
		this.tags = tags;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}