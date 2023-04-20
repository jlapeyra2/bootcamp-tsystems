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
import es.http.service.dto.Cientifico;
import es.http.service.service.CientificoServiceImpl;

@RestController
@RequestMapping("/api")
public class CientificoController {
	
	@Autowired
	CientificoServiceImpl cientificoServideImpl;
	
	@GetMapping("/cientifico")
	public List<Cientifico> listar(){
		return cientificoServideImpl.listar();
	}
	
	@PostMapping("/cientifico")
	public Cientifico salvar(@RequestBody Cientifico cientifico) {
		return cientificoServideImpl.guardar(cientifico);
	}
	
	@GetMapping("/cientifico/{id}")
	public Cientifico buscar(@PathVariable(name="id") Long id) {
		return cientificoServideImpl.buscar(id);
	}
	
	@PutMapping("/cientifico/{id}")
	public Cientifico actualizar(@PathVariable(name="id")Long id,@RequestBody Cientifico cientifico) {	
		cientificoServideImpl.buscar(id);
		cientifico.id = id;
		return cientificoServideImpl.actualizar(cientifico);
	}
	
	@DeleteMapping("/cientifico/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		cientificoServideImpl.eliminar(id);
	}
	
	
}
