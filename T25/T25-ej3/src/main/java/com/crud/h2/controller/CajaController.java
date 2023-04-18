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
import com.crud.h2.dto.Caja;
import com.crud.h2.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajaController {
	
	@Autowired
	CajaServiceImpl cajaServiceImpl;
	
	@GetMapping("/cajas")
	public List<Caja> listar(){
		return cajaServiceImpl.listar();
	}
	
	@PostMapping("/cajas")
	public Caja salvar(@RequestBody Caja caja) {
		
		return cajaServiceImpl.guardar(caja);
	}
	
	@GetMapping("/cajas/{id}")
	public Caja buscar(@PathVariable(name="id") Long id) {
		
		return cajaServiceImpl.buscar(id);
	}
	
	@PutMapping("/cajas/{id}")
	public Caja actualizar(@PathVariable(name="id")Long id,@RequestBody Caja caja) {
		
		
		Caja caja_seleccionado= cajaServiceImpl.buscar(id);
		
		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
		
		Caja caja_actualizado = cajaServiceImpl.actualizar(caja_seleccionado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		cajaServiceImpl.eliminar(id);
	}
	
	
}
