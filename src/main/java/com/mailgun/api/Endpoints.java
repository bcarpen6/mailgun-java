package com.mailgun.api;

public final class Endpoints {

	private Endpoints() {}

	public static final String MESSAGES = "/messages";
	public static final String MESSAGES_MIME = "/messages.mime";
	public static final String MESSAGE_DETAILS = "/messages/%s";
	public static final String UNSUBSCRIBES	= "/unsubscribes";
	public static final String UNSUBSCRIBE_DETAILS = "/unsubscribes/%s";
	public static final String COMPLAINTS = "/complaints";
	public static final String COMPLAINT_DETAILS = "/complaints/%s";
	public static final String BOUNCES = "/bounces";
	public static final String BOUNCE_DETAILS = "/bounces/%s";
	public static final String STATS = "/stats";
	public static final String TAGS	= "/tags/%s";
	public static final String EVENTS = "/events";
	public static final String ROUTES = "/routes";
	public static final String ROUTE_DETAILS = "/routes/%s";
	public static final String MAILBOXES = "/mailboxes";
	public static final String MAILBOX_DETAILS = "/mailboxes/%s";
	public static final String CAMPAIGNS = "/campaigns";
	public static final String CAMPAIGN_DEATILS	= "/campaigns/%s";
	public static final String LISTS = "/lists";
	public static final String LIST_DETAILS = "/lists/%s";
	public static final String VALIDATE	= "/address/validate";
	public static final String VALIDATE_PARSE = "/address/parse";
}
