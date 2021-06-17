package br.edu.fema.lp.jonas.produto.DTO;

import java.math.BigDecimal;

import br.edu.fema.lp.jonas.produto.model.Produto;

public class ProdutoDTO {
	
	private Long id;
	
	private String desricao;
	
	private Integer estoque;
	
	private BigDecimal preco;
	
	
	public ProdutoDTO() { }
	
	public ProdutoDTO(Produto produto) {
		this.id = produto.getId();
		this.desricao = produto.getDesricao();
		this.estoque = produto.getEstoque();
		this.preco = produto.getPreco();
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getDesricao() {
		return desricao;
	}
	public void setDesricao(String desricao) {
		this.desricao = desricao;
	}

	public Integer getEstoque() {
		return estoque;
	}
	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

}
