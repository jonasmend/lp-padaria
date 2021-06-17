package br.edu.fema.lp.jonas.venda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fema.lp.jonas.cliente.repository.ClienteRepository;
import br.edu.fema.lp.jonas.venda.repository.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;
}
