package com.distribuida.dto;

import java.io.Serializable;

public class Todos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Todos() {
		
	}
	
	private Integer id;

	private Integer userId;

	private String title;

	private boolean completed;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
}
