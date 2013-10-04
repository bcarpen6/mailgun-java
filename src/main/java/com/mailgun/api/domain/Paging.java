package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

public class Paging {

    @SerializedName("next")
	String nextUrl;

	@SerializedName("previous")
	String previousUrl;
	
	public String getNextUrl() {
		return this.nextUrl;
	}
	public void setNextUrl(String nextUrl) {
		this.nextUrl = nextUrl;
	}
	public String getPreviousUrl() {
		return this.previousUrl;
	}
	public void setPreviousUrl(String previousUrl) {
		this.previousUrl = previousUrl;
	}
	
}
