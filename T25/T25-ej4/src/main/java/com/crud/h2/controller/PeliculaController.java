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
import com.crud.h2.dto.Pelicula;
import com.crud.h2.service.PeliculaServiceImpl;

@RestController
@RequestMapping("/api")
public class PeliculaController {
	
	@Autowired
	PeliculaServiceImpl peliculaServideImpl;
	
	@GetMapping("/peliculas")
	public List<Pelicula> listar(){
		return peliculaServideImpl.listar();
	}
	
	@PostMapping("/peliculas")
	public Pelicula salvar(@RequestBody Pelicula cliente) {
		return peliculaServideImpl.guardar(cliente);
	}
	
	@GetMapping("/peliculas/{id}")
	public Pelicula buscar(@PathVariable(name="id") Long id) {
		return peliculaServideImpl.buscar(id);
	}
	
	@PutMapping("/peliculas/{id}")
	public Pelicula actualizar(@PathVariable(name="id")Long id,@RequestBody Pelicula pelicula) {	
		peliculaServideImpl.buscar(id);
		pelicula.id = id;
		return peliculaServideImpl.actualizar(pelicula);
	}
	
	@DeleteMapping("/peliculas/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		peliculaServideImpl.eliminar(id);
	}
	
	
}
