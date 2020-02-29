package com.distribuida.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.distribuida.dto.Todos;
import com.distribuida.service.ServiciosCliente;

@Named(value = "controladorTodos")
@SessionScoped
public class TodosController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private ServiciosCliente srv;

	private List<Todos> lista;

	@PostConstruct
	public void inicializar() {
		lista = srv.listarTodos();
	}

	public List<Todos> getLista() {
		return lista;
	}

	public void setLista(List<Todos> lista) {
		this.lista = lista;
	}

	public String actualizar() {
		lista = srv.listarTodos();
		return "index?faces-redirect=true";
	}

}
