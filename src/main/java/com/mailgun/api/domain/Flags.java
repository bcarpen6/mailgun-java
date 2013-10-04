package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

public class Flags {

    @SerializedName("is-test-mode")
	public Boolean isTestMode;

	@SerializedName("is-system-test")
	public Boolean isSystemTest;
	
	@SerializedName("is-authenticated")
	public Boolean isAuthenticated;
	
	public Boolean getIsTestMode() {
		return this.isTestMode;
	}
	public void setIsTestMode(Boolean isTestMode) {
		this.isTestMode = isTestMode;
	}
	public Boolean getIsSystemTest() {
		return this.isSystemTest;
	}
	public void setIsSystemTest(Boolean isSystemTest) {
		this.isSystemTest = isSystemTest;
	}
	public Boolean getIsAuthenticated() {
		return this.isAuthenticated;
	}
	public void setIsAuthenticated(Boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}
}