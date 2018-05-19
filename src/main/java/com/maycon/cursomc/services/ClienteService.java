package com.maycon.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycon.cursomc.domain.Cliente;
import com.maycon.cursomc.exceptions.ObjectNotFoundException;
import com.maycon.cursomc.repositories.ClienteRepository;

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
