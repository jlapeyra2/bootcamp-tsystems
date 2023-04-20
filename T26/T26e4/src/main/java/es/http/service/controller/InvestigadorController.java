package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import es.http.service.dto.Investigador;
import es.http.service.service.InvestigadorServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadorController {
	
	@Autowired
	InvestigadorServiceImpl investigadorServideImpl;
	
	@GetMapping("/investigador")
	public List<Investigador> listar(){
		return investigadorServideImpl.listar();
	}
	
	@PostMapping("/investigador")
	public Investigador salvar(@RequestBody Investigador investigador) {
		return investigadorServideImpl.guardar(investigador);
	}
	
	@GetMapping("/investigador/{id}")
	public Investigador buscar(@PathVariable(name="id") Long id) {
		return investigadorServideImpl.buscar(id);
	}
	
	@PutMapping("/investigador/{id}")
	public Investigador actualizar(@PathVariable(name="id")Long id,@RequestBody Investigador investigador) {	
		investigadorServideImpl.buscar(id);
		investigador.id = id;
		return investigadorServideImpl.actualizar(investigador);
	}
	
	@DeleteMapping("/investigador/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		investigadorServideImpl.eliminar(id);
	}
	
	
}
