package br.edu.fema.lp.jonas.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fema.lp.jonas.produto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
