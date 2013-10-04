package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

public class Storage {
	
	@SerializedName("url")
	public String url;
	
	@SerializedName("key")
	public String key;
	
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}
}