package com.mailgun.api.exceptions;

import com.sun.jersey.api.client.ClientResponse;

/**
 * Created with IntelliJ IDEA.
 * User: bcarpenter
 * Date: 10/8/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class MissingRequiredParameters extends MailGunException {
	public MissingRequiredParameters(String message,  ClientResponse response) {
		super(message, response);
	}
}
