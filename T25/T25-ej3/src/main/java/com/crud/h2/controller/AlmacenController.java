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
import com.crud.h2.dto.Almacen;
import com.crud.h2.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenController {
	
	@Autowired
	AlmacenServiceImpl almacenServideImpl;
	
	@GetMapping("/almacenes")
	public List<Almacen> listar(){
		return almacenServideImpl.listar();
	}
	
	@PostMapping("/almacenes")
	public Almacen salvar(@RequestBody Almacen cliente) {
		
		return almacenServideImpl.guardar(cliente);
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacen buscar(@PathVariable(name="id") Long id) {
		
		return almacenServideImpl.buscar(id);
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacen actualizar(@PathVariable(name="id")Long id,@RequestBody Almacen cliente) {
		
		Almacen almacen_seleccionado= almacenServideImpl.buscar(id);
		
		almacen_seleccionado.setLugar(cliente.getLugar());
		almacen_seleccionado.setCapacidad(cliente.getCapacidad());
		almacen_seleccionado.setCajas(cliente.getCajas());
		
		Almacen almacen_actualizado = almacenServideImpl.actualizar(almacen_seleccionado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		almacenServideImpl.eliminar(id);
	}
	
	
}
