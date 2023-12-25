package com.example.oopproject.EmployeeService.model;

import java.time.LocalDateTime;

public class Message {
	private String theme;
    private String text;
    private String sender;
	private LocalDateTime date;
    private boolean read;

	public Message(String theme, String text, String sender, boolean read, LocalDateTime date) {
		this.theme = theme;
		this.text = text;
		this.sender = sender;
		this.read = read;
		this.date = date;
	}

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
	public boolean getRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}


	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public boolean isRead() {
		return read;
	}

	@Override
	public String toString() {
		return "Message{" +
				"theme='" + theme + '\'' +
				", text='" + text + '\'' +
				", sender='" + sender + '\'' +
				", date=" + date +
				'}';
	}
}
