package com.mailgun.api.exceptions;

import com.mailgun.api.MailGunResponse;

public class MailGunException extends Throwable {
	public MailGunException(String message, MailGunResponse response) {
		super(String.format("%s - %s", message, response.getMessage()));
	}
}
