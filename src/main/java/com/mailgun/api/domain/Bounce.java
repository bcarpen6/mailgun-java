package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

public class Bounce {
	
	@SerializedName("code")
	public String code;
	
	@SerializedName("created_at")
	public String createdAt;
	
	@SerializedName("error")
	public String error;
	
	@SerializedName("address")
	public String address;
	
	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCreatedAt() {
		return this.createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getError() {
		return this.error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}