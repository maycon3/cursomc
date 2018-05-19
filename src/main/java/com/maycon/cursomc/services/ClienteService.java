package com.maycon.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycon.cursomc.domain.Cliente;
import com.maycon.cursomc.repositories.ClienteRepository;
import com.maycon.cursomc.resources.exception.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto Não Encontrado Id: "+ id +", tipo :"+
		Cliente.class.getName()));
	}
	
	
}
