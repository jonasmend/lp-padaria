package br.edu.fema.lp.jonas.produto.resource;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fema.lp.jonas.produto.DTO.ProdutoDTO;
import br.edu.fema.lp.jonas.produto.FORM.ProdutoFORM;
import br.edu.fema.lp.jonas.produto.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping()
	public ResponseEntity<List<ProdutoDTO>> obterTodosOsProdutos() {
		
		return this.produtoService.obterTodosOsProdutos();
	}
	
	@GetMapping("/{idProduto}")
	public ResponseEntity<ProdutoDTO> obterProdutoPorId(@PathVariable Long idProduto) {
		
		return this.produtoService.obterProdutoPorId(idProduto);
	}
	
	@PostMapping()
	@Transactional
	public ResponseEntity<Void> cadastrarNovoProduto(@RequestBody ProdutoFORM produtoForm) {
		
		return this.produtoService.cadastrarNovoProduto(produtoForm);
	}
	
	@DeleteMapping("/{idProduto}")
	@Transactional
	public ResponseEntity<Void> deletarProduto(@PathVariable Long idProduto) {
		
		return this.produtoService.deletarProduto(idProduto);
	}
	
}
