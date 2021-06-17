package br.edu.fema.lp.jonas.produto.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fema.lp.jonas.produto.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

	@Autowired
	private ProdutoService produtoService;
}
