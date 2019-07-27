package com.atos.equens.worldline.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Messenger")
public class Message {

	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Message")
	private String message;
	
	@Column(name = "Created")
	private Date created;
	
	@Column(name = "Author")
	private String author;
	
	public Message() {
		super();
	}

	public Message(int id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.author = author;
		this.created = new Date(System.currentTimeMillis());
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
		
}
