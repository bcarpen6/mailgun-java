package com.mailgun.api.exceptions;

import com.sun.jersey.api.client.ClientResponse;

/**
 * Created with IntelliJ IDEA.
 * User: bcarpenter
 * Date: 10/8/13
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class MailGunException extends Throwable {
	public MailGunException(String message, ClientResponse response) {
		super(String.format("%s - %s", message, response.getStatus()));
	}
}
