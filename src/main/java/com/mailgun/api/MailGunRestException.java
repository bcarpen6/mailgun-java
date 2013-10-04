package com.mailgun.api;

import com.sun.jersey.api.client.ClientResponse;

public class MailGunRestException extends Exception {

	private int errorCode;
	private String message;
	private String moreInfo;

	public MailGunRestException(String message, int errorCode) {
		this(message, errorCode, "");
	}

	public MailGunRestException(String message, int errorCode, String moreInfo) {
		super(message);
		this.message = message;
		this.errorCode = errorCode;
		this.moreInfo = moreInfo;
	}

	public static MailGunRestException parseResponse(ClientResponse response) {
		
		String message = "";
		String moreInfo = "";
		int errorCode = response.getClientResponseStatus().getStatusCode();
	
		return new MailGunRestException(message, errorCode, moreInfo);
	}

	public int getErrorCode() {
		return this.errorCode;
	}

	public String getErrorMessage() {
		return this.message;
	}

	public String getMoreInfo() {
		return this.moreInfo;
	}
}
