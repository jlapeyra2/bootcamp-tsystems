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
import com.crud.h2.dto.Fabricante;
import com.crud.h2.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServideImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listar(){
		return fabricanteServideImpl.listar();
	}
	
	@PostMapping("/fabricantes")
	public Fabricante salvar(@RequestBody Fabricante cliente) {
		
		return fabricanteServideImpl.guardar(cliente);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante buscar(@PathVariable(name="id") Long id) {
		
		Fabricante cliente_xid= new Fabricante();
		
		cliente_xid=fabricanteServideImpl.buscar(id);
		
		System.out.println("Cliente XID: "+cliente_xid);
		
		return cliente_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizar(@PathVariable(name="id")Long id,@RequestBody Fabricante cliente) {
		
		Fabricante fabricante_seleccionado= fabricanteServideImpl.buscar(id);
		
		fabricante_seleccionado.setNombre(cliente.getNombre());
		fabricante_seleccionado.setArticulos(cliente.getArticulos());
		
		Fabricante fabricante_actualizado = fabricanteServideImpl.actualizar(fabricante_seleccionado);
		
		System.out.println("El cliente actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		fabricanteServideImpl.eliminar(id);
	}
	
	
}
