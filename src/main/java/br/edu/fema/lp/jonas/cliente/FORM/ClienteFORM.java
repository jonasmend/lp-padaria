package br.edu.fema.lp.jonas.cliente.FORM;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ClienteFORM {
	
	private Long id;
	
	@NotNull
	@NotEmpty
	@Size(max = 70)
	private String nome;

	@NotNull
	@NotEmpty
	@Size(max = 10)
	private String dataNascimento;
	
	@NotNull
	@NotEmpty
	@Size(max = 14)
	private String cpf;
	
	@NotNull
	@NotEmpty
	@Size(max = 14)
	private String cep;
	
	@NotNull
	@NotEmpty
	@Size(max = 70)
	private String rua;
	
	@NotNull
	private Integer numero;
	
	@NotNull
	@NotEmpty
	@Size(max = 70)
	private String bairro;
	
	private String complemento;
	
	
	public ClienteFORM() { }


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

	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
