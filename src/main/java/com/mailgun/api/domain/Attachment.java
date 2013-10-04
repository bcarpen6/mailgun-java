package com.mailgun.api.domain;

import com.google.gson.annotations.SerializedName;

public class Attachment {
	
	@SerializedName("filename")
	public String filename;
	
	@SerializedName("content-type")
	public String contentType;
	
	@SerializedName("size")
	public String size;
	
	public String getFilename() {
		return this.filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}