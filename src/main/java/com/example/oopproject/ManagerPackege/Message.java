package com.example.oopproject.ManagerPackege;

public class Message {
	private String theme;
    private String text;
    private Request sender;
    private boolean read;
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Request getSender() {
		return sender;
	}
	public void setSender(Request sender) {
		this.sender = sender;
	}
	public boolean getRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
    
    

}
