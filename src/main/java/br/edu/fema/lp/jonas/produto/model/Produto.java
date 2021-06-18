package br.edu.fema.lp.jonas.produto.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.edu.fema.lp.jonas.produto.FORM.ProdutoFORM;

@Entity
@Table(name = "produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String desricao;
	
	private Integer estoque;
	
	private BigDecimal preco;
	
	
	public Produto() { }
	
	public Produto(ProdutoFORM formulario) {
		this.id = formulario.getId();
		this.desricao = formulario.getDesricao();
		this.estoque = formulario.getEstoque();
		this.preco = formulario.getPreco();
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
