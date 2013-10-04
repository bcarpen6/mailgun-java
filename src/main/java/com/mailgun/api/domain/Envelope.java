package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

public class Envelope {
	
	@SerializedName("transport")
	String transport;
	
	@SerializedName("sender")
	String sender;
	
	@SerializedName("sending-ip")
	String sendingIp;
	
	@SerializedName("targets")
	String targets;
	
	public String getTransport() {
		return this.transport;
	}
	public void setTransport(String transport) {
		this.transport = transport;
	}
	public String getSender() {
		return this.sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getSendingIp() {
		return this.sendingIp;
	}
	public void setSendingIp(String sendingIp) {
		this.sendingIp = sendingIp;
	}
	public String getTargets() {
		return this.targets;
	}
	public void setTargets(String targets) {
		this.targets = targets;
	}
	
}
