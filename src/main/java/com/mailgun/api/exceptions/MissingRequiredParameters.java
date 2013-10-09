package com.mailgun.api.exceptions;

import com.mailgun.api.MailGunResponse;

public class MissingRequiredParameters extends MailGunException {
	public MissingRequiredParameters(String message,  MailGunResponse response) {
		super(message, response);
	}
}
