package com.mailgun.api;

import com.google.gson.annotations.SerializedName;

public class MailGunResponse {

	@SerializedName("message")
	String message;

	@SerializedName("id")
	String id;

	public MailGunResponse() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
