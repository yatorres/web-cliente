package com.distribuida.dto;

import java.io.Serializable;

public class Geo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public Geo() {
		
	}
	
	private Integer id;

	private String lat;

	private String lng;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

}
