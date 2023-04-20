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
import es.http.service.dto.Suministra;
import es.http.service.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {
	
	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listar(){
		return suministraServiceImpl.listar();
	}
	
	@PostMapping("/suministra")
	public Suministra salvar(@RequestBody Suministra suministra) {
		return suministraServiceImpl.guardar(suministra);
	}
	
	@GetMapping("/suministra/{id}")
	public Suministra buscar(@PathVariable(name="id") Long id) {
		return suministraServiceImpl.buscar(id);
	}
	
	@PutMapping("/suministra/{id}")
	public Suministra actualizar(@PathVariable(name="id")Long id,@RequestBody Suministra suministra) {
		suministraServiceImpl.buscar(id);
		suministra.id = id;
		return suministraServiceImpl.actualizar(suministra);
	}
	
	@DeleteMapping("/suministra/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		suministraServiceImpl.eliminar(id);
	}
	
	
}
