package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StoredMessage {
	
	@SerializedName("tags")
	List<String> tags;
	
	@SerializedName("timestamp")
	String timestamp;
	
	@SerializedName("storage")
	Storage storage;
	
	@SerializedName("campaigns")
	List<String> campaigns;
	
	@SerializedName("user-variables")
	UserVariables userVariables;
	
	@SerializedName("flags")
	Flags flags;
	
	@SerializedName("message")
	Message message;
	
	@SerializedName("event")
	String event;
	
	public List<String> getTags() {
		return this.tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public String getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Storage getStorage() {
		return this.storage;
	}
	public void setStorage(Storage storage) {
		this.storage = storage;
	}
	public List<String> getCampaigns() {
		return this.campaigns;
	}
	public void setCampaigns(List<String> campaigns) {
		this.campaigns = campaigns;
	}
	public UserVariables getUserVariables() {
		return this.userVariables;
	}
	public void setUserVariables(UserVariables userVariables) {
		this.userVariables = userVariables;
	}
	public Flags getFlags() {
		return this.flags;
	}
	public void setFlags(Flags flags) {
		this.flags = flags;
	}
	public Message getMessage() {
		return this.message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
}
