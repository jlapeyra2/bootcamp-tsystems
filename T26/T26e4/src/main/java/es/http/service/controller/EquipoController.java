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
import es.http.service.dto.Equipo;
import es.http.service.service.EquipoServiceImpl;

@RestController
@RequestMapping("/api")
public class EquipoController {
	
	@Autowired
	EquipoServiceImpl equipoServiceImpl;
	
	@GetMapping("/equipo")
	public List<Equipo> listar(){
		return equipoServiceImpl.listar();
	}
	
	@PostMapping("/equipo")
	public Equipo salvar(@RequestBody Equipo equipo) {
		return equipoServiceImpl.guardar(equipo);
	}
	
	@GetMapping("/equipo/{id}")
	public Equipo buscar(@PathVariable(name="id") Long id) {
		return equipoServiceImpl.buscar(id);
	}
	
	@PutMapping("/equipo/{id}")
	public Equipo actualizar(@PathVariable(name="id")Long id,@RequestBody Equipo equipo) {
		equipoServiceImpl.buscar(id);
		equipo.id = id;
		return equipoServiceImpl.actualizar(equipo);
	}
	
	@DeleteMapping("/equipo/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		equipoServiceImpl.eliminar(id);
	}
	
	
}
