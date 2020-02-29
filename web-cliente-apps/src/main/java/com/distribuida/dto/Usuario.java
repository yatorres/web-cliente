package com.distribuida.dto;

import java.io.Serializable;

public class Usuario implements Serializable{

	public Usuario() {
		
	}
	
	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;

	private String userName;

	private String email;

	private String phone;

	private String website;

	private Company idCompany;

	private Direccion idDireccion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Company getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(Company idCompany) {
		this.idCompany = idCompany;
	}

	public Direccion getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Direccion idDireccion) {
		this.idDireccion = idDireccion;
	}
	
	
}
