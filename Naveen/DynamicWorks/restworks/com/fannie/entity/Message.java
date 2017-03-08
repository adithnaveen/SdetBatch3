package com.fannie.entity;

public class Message {
	private int messageId;
	private String msg;
	private  String author;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", msg=" + msg + ", author="
				+ author + "]";
	}

}