package br.edu.fema.lp.jonas.venda.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fema.lp.jonas.venda.service.VendaService;

@RestController
@RequestMapping("/venda")
public class VendaResource {

	@Autowired
	private VendaService vendaService;
}
