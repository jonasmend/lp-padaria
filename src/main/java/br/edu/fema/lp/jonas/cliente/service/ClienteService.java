package br.edu.fema.lp.jonas.cliente.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.edu.fema.lp.jonas.cliente.DTO.ClienteDTO;
import br.edu.fema.lp.jonas.cliente.FORM.ClienteFORM;
import br.edu.fema.lp.jonas.cliente.model.Cliente;
import br.edu.fema.lp.jonas.cliente.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public ResponseEntity<List<ClienteDTO>> obterTodosOsClientes() {
		
		List<Cliente> listaDeClientes = this.clienteRepository.findAll();
		
		return ResponseEntity
				.status(!listaDeClientes.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND)
				.body(ClienteDTO.onverterClientesEmClientesDTO(listaDeClientes));
	}
	
	public ResponseEntity<ClienteDTO> obterCliente(Long idCliente) {
		
		Optional<Cliente> oCliente = this.clienteRepository.findById(idCliente);
		
		if(!oCliente.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado!");
		}
		
		return ResponseEntity.ok(new ClienteDTO(oCliente.get()));
	}
	
	public ResponseEntity<Void> cadastrarNovoCliente(ClienteFORM clienteForm) {
		
		Cliente novoCliente = new Cliente(clienteForm);
		this.clienteRepository.save(novoCliente);
		
		return ResponseEntity.ok().build();
	}
	
	public ResponseEntity<Void> deletarCliente(Long idCliente) {
		
		Optional<Cliente> oCliente = this.clienteRepository.findById(idCliente);
		
		if(!oCliente.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrado!");
		}
		
		this.clienteRepository.deleteById(idCliente);
		return ResponseEntity.ok().build();
	}
}
