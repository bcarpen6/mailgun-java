package com.mailgun.api.exceptions;

import com.mailgun.api.MailGunResponse;

public class MissingEndpoint extends MailGunException {
	public MissingEndpoint(String message,  MailGunResponse response) {
		super(message, response);
	}
}
