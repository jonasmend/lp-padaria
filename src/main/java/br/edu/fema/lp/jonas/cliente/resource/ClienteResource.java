package br.edu.fema.lp.jonas.cliente.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fema.lp.jonas.cliente.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;

}
