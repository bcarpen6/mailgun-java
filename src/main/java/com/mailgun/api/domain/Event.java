package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Event {
	// TODO CHECK THIS, STAT TAG RETURNS {}, this returns a list
	@SerializedName("tags")
	List<Tags> tags;
	
	@SerializedName("envelope")
	Envelope envelope;
	
	@SerializedName("delivery_status")
	DeliveryStatus deliveryStatus;
	
	@SerializedName("campaigns")
	List<Campaign> campaigns;
	
	@SerializedName("reason")
	String reason;
	
	@SerializedName("user-variables")
	UserVariables userVariables;
	
	@SerializedName("flags")
	Flags flags;
	
	@SerializedName("timestamp")
	String timestamp;
	
	@SerializedName("message")
	Message message;
	
	@SerializedName("recipient")
	String recipient;
	
	@SerializedName("event")
	String event;
	
	public List<Tags> getTags() {
		return this.tags;
	}
	public void setTags(List<Tags> tags) {
		this.tags = tags;
	}
	public Envelope getEnvelope() {
		return this.envelope;
	}
	public void setEnvelope(Envelope envelope) {
		this.envelope = envelope;
	}
	public DeliveryStatus getDeliveryStatus() {
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public List<Campaign> getCampaigns() {
		return this.campaigns;
	}
	public void setCampaigns(List<Campaign> campaigns) {
		this.campaigns = campaigns;
	}
	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
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
	public String getTimestamp() {
		return this.timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Message getMessage() {
		return this.message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public String getRecipient() {
		return this.recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getEvent() {
		return this.event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
}
