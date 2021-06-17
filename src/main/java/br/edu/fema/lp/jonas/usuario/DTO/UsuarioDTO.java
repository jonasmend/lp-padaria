package br.edu.fema.lp.jonas.usuario.DTO;

import br.edu.fema.lp.jonas.usuario.model.Usuario;

public class UsuarioDTO {

	private String nome;
	

	public UsuarioDTO() { }
	
	public UsuarioDTO(Usuario usuario) {
		this.nome = usuario.getNome();
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
