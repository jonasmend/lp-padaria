package br.edu.fema.lp.jonas.venda.resource;

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

import br.edu.fema.lp.jonas.venda.DTO.VendaDTO;
import br.edu.fema.lp.jonas.venda.FORM.VendaFORM;
import br.edu.fema.lp.jonas.venda.service.VendaService;

@RestController
@RequestMapping("/venda")
public class VendaResource {

	@Autowired
	private VendaService vendaService;
	
	@GetMapping()
	public ResponseEntity<List<VendaDTO>> obterTodasAsVendas() {
		
		return this.vendaService.obterTodasAsVendas();
	}
	
	@GetMapping("/{idVenda}")
	public ResponseEntity<VendaDTO> obterVendaPorId(@PathVariable Long idVenda) {
		
		return this.vendaService.obterVendaPorId(idVenda);
	}
	
	@PostMapping()
	@Transactional
	public ResponseEntity<Void> cadastrarNovaVenda(@RequestBody VendaFORM vendaForm) {
		
		return this.vendaService.cadastrarNovaVenda(vendaForm);
	}
	
	@DeleteMapping("/{idVenda}")
	@Transactional
	public ResponseEntity<Void> deletarVendaPorId(@PathVariable Long idVenda) {
		
		return this.vendaService.deletarVendaPorId(idVenda);
	}
	
}
