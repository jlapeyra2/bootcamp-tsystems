package com.crud.h2.controller;

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
import com.crud.h2.dto.Sala;
import com.crud.h2.service.SalaServiceImpl;

@RestController
@RequestMapping("/api")
public class SalaController {
	
	@Autowired
	SalaServiceImpl salaServiceImpl;
	
	@GetMapping("/salas")
	public List<Sala> listar(){
		return salaServiceImpl.listar();
	}
	
	@PostMapping("/salas")
	public Sala salvar(@RequestBody Sala sala) {
		return salaServiceImpl.guardar(sala);
	}
	
	@GetMapping("/salas/{id}")
	public Sala buscar(@PathVariable(name="id") Long id) {
		return salaServiceImpl.buscar(id);
	}
	
	@PutMapping("/salas/{id}")
	public Sala actualizar(@PathVariable(name="id")Long id,@RequestBody Sala sala) {
		salaServiceImpl.buscar(id);
		sala.id = id;
		return salaServiceImpl.actualizar(sala);
	}
	
	@DeleteMapping("/salas/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		salaServiceImpl.eliminar(id);
	}
	
	
}
