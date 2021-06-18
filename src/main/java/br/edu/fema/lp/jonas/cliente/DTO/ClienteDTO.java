package br.edu.fema.lp.jonas.cliente.DTO;

import java.util.List;
import java.util.stream.Collectors;

import br.edu.fema.lp.jonas.cliente.model.Cliente;

public class ClienteDTO {
	
	private Long id;
	
	private String nome;
	
	private String dataNascimento;
	
	private String cpf;
	
	private String cep;
	
	private String rua;
	
	private Integer numero;
	
	private String bairro;
	
	private String complemento;
	
	
	public ClienteDTO() { }
	
	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.dataNascimento = cliente.getDataNascimento();
		this.cpf = cliente.getCpf();
		this.cep = cliente.getCep();
		this.rua = cliente.getRua();
		this.numero = cliente.getNumero();
		this.bairro = cliente.getBairro();
		this.complemento = cliente.getComplemento();
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
	
	
	public static List<ClienteDTO> onverterClientesEmClientesDTO(List<Cliente> listaDeClientes) {
		
		return listaDeClientes.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}

}
