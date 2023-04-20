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
	public Fabricante salvar(@RequestBody Fabricante fabricante) {
		
		return fabricanteServideImpl.guardar(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricante buscar(@PathVariable(name="id") Long id) {
		
		Fabricante fabricante_xid= new Fabricante();
		
		fabricante_xid=fabricanteServideImpl.buscar(id);
		
		System.out.println("fabricante XID: "+fabricante_xid);
		
		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricante actualizar(@PathVariable(name="id")Long id,@RequestBody Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado= fabricanteServideImpl.buscar(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		fabricante_seleccionado.setArticulos(fabricante.getArticulos());
		
		Fabricante fabricante_actualizado = fabricanteServideImpl.actualizar(fabricante_seleccionado);
		
		System.out.println("El fabricante actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		fabricanteServideImpl.eliminar(id);
	}
	
	
}
