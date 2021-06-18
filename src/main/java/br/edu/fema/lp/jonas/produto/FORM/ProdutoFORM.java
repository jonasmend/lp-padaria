package br.edu.fema.lp.jonas.produto.FORM;

import java.math.BigDecimal;

public class ProdutoFORM {
	
	private Long id;
	
	private String desricao;
	
	private Integer estoque;
	
	private BigDecimal preco;
	
	
	public ProdutoFORM() { }


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
