package br.edu.fema.lp.jonas.produto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.edu.fema.lp.jonas.produto.DTO.ProdutoDTO;
import br.edu.fema.lp.jonas.produto.FORM.ProdutoFORM;
import br.edu.fema.lp.jonas.produto.model.Produto;
import br.edu.fema.lp.jonas.produto.repository.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public ResponseEntity<List<ProdutoDTO>> obterTodosOsProdutos() {
		
		List<Produto> listaDeProdutos = this.produtoRepository.findAll();
	
		return ResponseEntity
				.status(!listaDeProdutos.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND)
				.body(ProdutoDTO.converterProdutosEmProdutosDTO(listaDeProdutos));
	}
	
	public ResponseEntity<ProdutoDTO> obterProdutoPorId(Long idProduto) {
		
		Optional<Produto> oProduto = this.produtoRepository.findById(idProduto);
		
		return ResponseEntity
				.status(oProduto.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND)
				.body(new ProdutoDTO(oProduto.get()));
	}
	
	public ResponseEntity<Void> cadastrarNovoProduto(ProdutoFORM produtoForm) {
		
		Produto novoProduto = new Produto(produtoForm);
		this.produtoRepository.save(novoProduto);
		
		return ResponseEntity.ok().build();
	}
	
	public ResponseEntity<Void> deletarProduto(Long idProduto) {
		
		Optional<Produto> oProduto = this.produtoRepository.findById(idProduto);
		
		if(!oProduto.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não enontrado!");
		}
		
		this.produtoRepository.deleteById(idProduto);
		return ResponseEntity.ok().build();
	}
}
