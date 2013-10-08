package com.mailgun.api.exceptions;

import com.mailgun.api.MailGunResponse;

/**
 * Created with IntelliJ IDEA.
 * User: bcarpenter
 * Date: 10/8/13
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class MailGunException extends Throwable {
	public MailGunException(String message, MailGunResponse response) {
		super(String.format("%s - %s", message, response.getMessage()));
	}
}
