package org.jose.foroalura.controladores;

import java.util.List;

import org.jose.foroalura.modelo.Topico;
import org.jose.foroalura.repositorio.TopicoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topico")
public class TopicoControlador {

	@Autowired
	private TopicoRepositorio topicoRepositorio;
	
	@GetMapping("/{topicoId}")
	public Topico findOne(@PathVariable int topicoId) {
		
		Topico topico = topicoRepositorio.getReferenceById(topicoId);
		
		//Topico topico = topicoRepositorio.findById(topicoId).get();
		return topico; 
	}

	@GetMapping
	public List<Topico> findAll(){

		List<Topico> topicos = topicoRepositorio.findAll();
		return topicos;
	}
	

}
