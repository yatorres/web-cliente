package com.distribuida.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.distribuida.dto.Usuario;
import com.distribuida.service.ServiciosCliente;

@Named(value = "controladorUsuario")
@SessionScoped
public class UserController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ServiciosCliente srv;

	private List<Usuario> lista;

	@PostConstruct
	public void inicializar() {
		lista = srv.listarUsuarios();
	}

	public List<Usuario> getLista() {
		return lista;
	}

	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}

	public String actualizar() {
		lista = srv.listarUsuarios();
		return "index?faces-redirect=true";
	}

}
