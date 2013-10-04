package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

public class DeliveryStatus {
	
	@SerializedName("message")
	String message;
	
	@SerializedName("code")
	String code;
	
	@SerializedName("description")
	String description;
	
	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
