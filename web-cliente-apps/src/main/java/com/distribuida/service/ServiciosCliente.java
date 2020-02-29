package com.distribuida.service;

import java.util.List;

import com.distribuida.dto.Todos;
import com.distribuida.dto.Usuario;


public interface ServiciosCliente {
	
	List<Usuario> listarUsuarios();
	
	List<Todos> listarTodos();


	
}
