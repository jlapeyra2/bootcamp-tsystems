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
import es.http.service.dto.Facultad;
import es.http.service.service.FacultadServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultadController {
	
	@Autowired
	FacultadServiceImpl facultadServideImpl;
	
	@GetMapping("/facultad")
	public List<Facultad> listar(){
		return facultadServideImpl.listar();
	}
	
	@PostMapping("/facultad")
	public Facultad salvar(@RequestBody Facultad facultad) {
		return facultadServideImpl.guardar(facultad);
	}
	
	@GetMapping("/facultad/{id}")
	public Facultad buscar(@PathVariable(name="id") Long id) {
		return facultadServideImpl.buscar(id);
	}
	
	@PutMapping("/facultad/{id}")
	public Facultad actualizar(@PathVariable(name="id")Long id,@RequestBody Facultad facultad) {	
		facultadServideImpl.buscar(id);
		facultad.id = id;
		return facultadServideImpl.actualizar(facultad);
	}
	
	@DeleteMapping("/facultad/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		facultadServideImpl.eliminar(id);
	}
	
	
}
