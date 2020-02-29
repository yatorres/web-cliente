package com.distribuida.dto;

import java.io.Serializable;

public class Direccion implements Serializable{

	public Direccion() {
		
	}

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String street;

	private String suite;

	private String city;

	private String zipcode;

	private Geo idGeo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Geo getIdGeo() {
		return idGeo;
	}

	public void setIdGeo(Geo idGeo) {
		this.idGeo = idGeo;
	}

}
