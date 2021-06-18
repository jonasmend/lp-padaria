package br.edu.fema.lp.jonas.venda.FORM;

import br.edu.fema.lp.jonas.cliente.model.Cliente;
import br.edu.fema.lp.jonas.produto.model.Produto;

public class VendaFORM {

	private Long id;

	private Cliente cliente;
	
	private Produto produto;
	
	private Integer quantidade;
	
	
	public VendaFORM() { }


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
}
