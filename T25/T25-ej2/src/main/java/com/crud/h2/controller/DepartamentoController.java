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
import com.crud.h2.dto.Departamento;
import com.crud.h2.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl departamentoServideImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listar(){
		return departamentoServideImpl.listar();
	}
	
	@PostMapping("/departamentos")
	public Departamento salvar(@RequestBody Departamento cliente) {
		return departamentoServideImpl.guardar(cliente);
	}
	
	@GetMapping("/departamentos/{id}")
	public Departamento buscar(@PathVariable(name="id") Long id) {	
		return departamentoServideImpl.buscar(id);
	}
	
	@PutMapping("/departamentos/{id}")
	public Departamento actualizar(@PathVariable(name="id")Long id,@RequestBody Departamento departamento) {
		
		Departamento departamento_seleccionado= departamentoServideImpl.buscar(id);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		departamento_seleccionado.setEmpleados(departamento.getEmpleados());
		
		Departamento departamento_actualizado = departamentoServideImpl.actualizar(departamento_seleccionado);
		
		return departamento_actualizado;
	}
	
	@DeleteMapping("/departamentos/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		departamentoServideImpl.eliminar(id);
	}
	
	
}
