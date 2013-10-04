package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

public class Headers {
	
	@SerializedName("to")
	public String to;
	
	@SerializedName("message-id")
	public String messageId;
	
	@SerializedName("from")
	public String from;
	
	@SerializedName("subject")
	public String subject;
	
	public String getTo() {
		return this.to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getMessageId() {
		return this.messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getFrom() {
		return this.from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}