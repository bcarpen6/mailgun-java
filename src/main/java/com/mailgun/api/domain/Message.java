package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Message {
	
	@SerializedName("headers")
	public Headers headers;
	
	@SerializedName("attachments")
	public List<Attachment> attachments;
	
	@SerializedName("recipients")
	public List<String> recipients;
	
	@SerializedName("size")
	public Integer size;
	
	public Headers getHeaders() {
		return this.headers;
	}
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}
	public List<Attachment> getAttachments() {
		return this.attachments;
	}
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}
	public List<String> getRecipients() {
		return this.recipients;
	}
	public void setRecipients(List<String> recipients) {
		this.recipients = recipients;
	}
	public Integer getSize() {
		return this.size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	
}