package com.crud.h2.controller;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.h2.dto.Articulo;
import com.crud.h2.dto.Fabricante;
import com.crud.h2.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listar(){
		return articuloServiceImpl.listar();
	}
	
	@PostMapping("/articulos")
	public Articulo salvar(@RequestBody Articulo articulo) {
		
		return articuloServiceImpl.guardar(articulo);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulo buscar(@PathVariable(name="id") Long id) {
		
		Articulo articulo_xid= new Articulo();
		
		articulo_xid=articuloServiceImpl.buscar(id);
		
		System.out.println("Articulo XID: "+articulo_xid);
		
		return articulo_xid;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulo actualizar(@PathVariable(name="id")Long id,@RequestBody Articulo articulo) {
		
		
		Articulo articulo_seleccionado= articuloServiceImpl.buscar(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		Articulo articulo_actualizado = articuloServiceImpl.actualizar(articulo_seleccionado);
		
		System.out.println("El articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		articuloServiceImpl.eliminar(id);
	}
	
	
}
