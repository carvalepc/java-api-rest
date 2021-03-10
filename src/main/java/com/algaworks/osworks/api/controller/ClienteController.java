package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.algaworks.osworks.domain.model.Cliente;

@RestController

public class ClienteController {

	@GetMapping("/clientes")
	
	public List<Cliente> listar() {
		
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Luiz Eduardo Carvalho");
		cliente1.setEmail("luiz@gmail.com");
		cliente1.setTelefone("35991330239");
			
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Deborah Carvalho");
		cliente2.setEmail("Deborah@gmail.com");
		cliente2.setTelefone("35988629685");
		
		return Arrays.asList(cliente1, cliente2);
		
	}
}
