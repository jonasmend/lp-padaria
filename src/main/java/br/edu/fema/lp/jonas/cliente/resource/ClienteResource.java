package br.edu.fema.lp.jonas.cliente.resource;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fema.lp.jonas.cliente.DTO.ClienteDTO;
import br.edu.fema.lp.jonas.cliente.FORM.ClienteFORM;
import br.edu.fema.lp.jonas.cliente.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping()
	public ResponseEntity<List<ClienteDTO>> obterTodosOsClientes() {
		
		return this.clienteService.obterTodosOsClientes();
	}
	
	@GetMapping("/{idCliente}")
	public ResponseEntity<ClienteDTO> obterCliente(@PathVariable Long idCliente) {
		
		return this.clienteService.obterCliente(idCliente);
	}
	
	@PostMapping()
	@Transactional
	public ResponseEntity<Void> cadastrarNovoCliente(@RequestBody @Valid ClienteFORM clienteForm) {
		
		return this.clienteService.cadastrarNovoCliente(clienteForm);
	}

	@DeleteMapping("/{idCliente}")
	@Transactional
	public ResponseEntity<Void> deletarCliente(@PathVariable Long idCliente) {
		
		return this.clienteService.deletarCliente(idCliente);
	}
}
