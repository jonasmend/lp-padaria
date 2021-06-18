package br.edu.fema.lp.jonas.venda.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.edu.fema.lp.jonas.venda.DTO.VendaDTO;
import br.edu.fema.lp.jonas.venda.FORM.VendaFORM;
import br.edu.fema.lp.jonas.venda.model.Venda;
import br.edu.fema.lp.jonas.venda.repository.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;
	
	public ResponseEntity<List<VendaDTO>> obterTodasAsVendas() {
		
		List<Venda> listaDeVendas = this.vendaRepository.findAll();
		
		return ResponseEntity
				.status(!listaDeVendas.isEmpty() ? HttpStatus.OK : HttpStatus.NOT_FOUND)
				.body(VendaDTO.converterVendasEmVendasDTO(listaDeVendas));
	}
	
	public ResponseEntity<VendaDTO> obterVendaPorId(Long idVenda) {
		
		Optional<Venda> oVenda = this.vendaRepository.findById(idVenda);
		
		return ResponseEntity
				.status(oVenda.isPresent() ? HttpStatus.OK : HttpStatus.NOT_FOUND)
				.body(new VendaDTO(oVenda.get()));
	}
	
	public ResponseEntity<Void> cadastrarNovaVenda(VendaFORM vendaForm) {
		
		Venda novaVenda = new Venda(vendaForm);
		this.vendaRepository.save(novaVenda);
		
		return ResponseEntity.ok().build();
	}
	
	public ResponseEntity<Void> deletarVendaPorId(Long idVenda) {
		
		Optional<Venda> oVenda = this.vendaRepository.findById(idVenda);
		
		if(!oVenda.isPresent()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Venda não encontrada!");
		}
		
		this.vendaRepository.delete(oVenda.get());
		return ResponseEntity.ok().build();
	}
	
}
