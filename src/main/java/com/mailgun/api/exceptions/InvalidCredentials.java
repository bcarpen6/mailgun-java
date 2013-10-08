package com.mailgun.api.exceptions;

import com.mailgun.api.MailGunResponse;

/**
 * Created with IntelliJ IDEA.
 * User: bcarpenter
 * Date: 10/8/13
 * Time: 3:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class InvalidCredentials extends MailGunException {
	public InvalidCredentials(String message, MailGunResponse response) {
		super(message, response);
	}
}
