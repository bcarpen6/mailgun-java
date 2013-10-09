package com.mailgun.api.exceptions;

import com.mailgun.api.MailGunResponse;

public class InvalidCredentials extends MailGunException {
	public InvalidCredentials(String message, MailGunResponse response) {
		super(message, response);
	}
}
