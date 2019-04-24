package com.sm.mail.beans;

public class MailMessage {
	protected String to;
	protected String from;
	protected String subject;
	protected String body;
	protected String[] attachmentFileNames;

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String[] getAttachmentFileNames() {
		return attachmentFileNames;
	}

	public void setAttachmentFileNames(String[] attachmentFileNames) {
		this.attachmentFileNames = attachmentFileNames;
	}
}
