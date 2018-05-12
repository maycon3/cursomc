package com.maycon.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maycon.cursomc.domain.Cliente;
import com.maycon.cursomc.services.ClienteService;

@Controller
@RequestMapping(value ="/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService servico;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		Cliente obj = servico.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}
