package br.edu.fema.lp.jonas.usuario.DTO;

import br.edu.fema.lp.jonas.usuario.model.Usuario;

public class UsuarioDTO {
	
	private Long id;

	private String nome;
	

	public UsuarioDTO() { }
	
	public UsuarioDTO(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
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
