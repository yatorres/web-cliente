package com.distribuida.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.distribuida.dto.Todos;
import com.distribuida.dto.Usuario;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@ApplicationScoped
public class ServiciosClienteImpl implements ServiciosCliente {

	private ObjectMapper mapper = new ObjectMapper();
	private HttpClient client = HttpClient.newHttpClient();
	private HttpResponse<String> response;
	static final String URI_USUARIOS = "http://localhost:9999/users";
	static final String URI_TODOS = "http://localhost:9999/todos";
	
	@Override
	public List<Usuario> listarUsuarios() {
		List<Usuario> lista = new ArrayList<>();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URI_USUARIOS))
				.GET().build();
		try {
			response = client.send(request, BodyHandlers.ofString());
			lista = mapper.readValue(response.body(), new TypeReference<List<Usuario>>() {});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	@Override
	public List<Todos> listarTodos() {
		List<Todos> lista = new ArrayList<>();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URI_TODOS))
				.GET().build();
		try {
			response = client.send(request, BodyHandlers.ofString());
			lista = mapper.readValue(response.body(), new TypeReference<List<Todos>>() {});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

}
