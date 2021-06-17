package br.edu.fema.lp.jonas.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.fema.lp.jonas.cliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
