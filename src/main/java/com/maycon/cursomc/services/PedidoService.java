package com.maycon.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maycon.cursomc.domain.Pedido;
import com.maycon.cursomc.repositories.PedidoRepository;
import com.maycon.cursomc.resources.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não Encontrado! Id:" + id +
				", Tipo: "+ Pedido.class.getName()));
	}
}
