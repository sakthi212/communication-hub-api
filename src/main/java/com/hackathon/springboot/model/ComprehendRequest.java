package com.hackathon.springboot.model;

public class ComprehendRequest {
	private String text;
	private String language;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

}
