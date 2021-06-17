package br.edu.fema.lp.jonas.cliente.DTO;

import br.edu.fema.lp.jonas.cliente.model.Cliente;

public class ClienteDTO {
	
	private Long id;
	
	private String nome;
	
	
	public ClienteDTO() { }
	
	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
