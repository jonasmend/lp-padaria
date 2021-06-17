package br.edu.fema.lp.jonas.venda.DTO;

import java.math.BigDecimal;

import br.edu.fema.lp.jonas.cliente.model.Cliente;
import br.edu.fema.lp.jonas.produto.model.Produto;
import br.edu.fema.lp.jonas.venda.model.Venda;

public class VendaDTO {

	private Long id;

	private Cliente cliente;
	
	private Produto produto;
	
	private Integer quantidade;
	
	private BigDecimal valorProduto;
	
	private BigDecimal valorVenda;
	
	
	public VendaDTO() { }
	
	public VendaDTO(Venda venda) {
		this.id = venda.getId();
		this.cliente = venda.getCliente();
		this.produto = venda.getProduto();
		this.quantidade = venda.getQuantidade();
		this.valorProduto = venda.getValorProduto();
		this.valorVenda = venda.getValorVenda();
	}

	
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

	public BigDecimal getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(BigDecimal valorProduto) {
		this.valorProduto = valorProduto;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}
}
