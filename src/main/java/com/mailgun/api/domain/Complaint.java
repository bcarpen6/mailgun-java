package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

public class Complaint {
	
	@SerializedName("count")
	public Integer count;
	
	@SerializedName("created_at")
	public String createdAt;
	
	@SerializedName("address")
	public String address;
	
	public Integer getCount() {
		return this.count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getCreatedAt() {
		return this.createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}