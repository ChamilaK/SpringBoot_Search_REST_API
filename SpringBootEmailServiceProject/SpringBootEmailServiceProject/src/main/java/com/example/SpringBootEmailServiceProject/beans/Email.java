package com.example.SpringBootEmailServiceProject.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Email")
public class Email {
	
	@Id
	@Column(name="id")
	int id;
	@Column(name="subject")
	String subject;
	@Column(name="message")
	String message;
	@Column(name="to")
	String to;
	@Column(name="from")
	String from;
	
	
	public Email()
	{
		
	}
	
	public Email(int id, String subject, String message, String to, String from) {
		//super();
		this.id = id;
		this.subject = subject;
		this.message = message;
		this.to = to;
		this.from = from;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
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
	

}
