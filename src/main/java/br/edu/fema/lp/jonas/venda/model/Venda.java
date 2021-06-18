package br.edu.fema.lp.jonas.venda.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.fema.lp.jonas.cliente.model.Cliente;
import br.edu.fema.lp.jonas.produto.model.Produto;
import br.edu.fema.lp.jonas.venda.FORM.VendaFORM;

@Entity
@Table(name = "venda")
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente", referencedColumnName = "id")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "id_produto", referencedColumnName = "id")
	private Produto produto;
	
	private Integer quantidade;
	
	@Column(name = "valor_produto")
	private BigDecimal valorProduto;
	
	@Column(name = "valor_venda")
	private BigDecimal valorVenda;
	
	
	public Venda() { }
	
	public Venda(VendaFORM formulario) {
		this.id = formulario.getId();
		this.cliente = formulario.getCliente();
		this.produto = formulario.getProduto();
		this.quantidade = formulario.getQuantidade();
		this.valorProduto = formulario.getProduto().getPreco();
		this.valorVenda = formulario.getProduto().getPreco().multiply(BigDecimal.valueOf(formulario.getQuantidade()));
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
