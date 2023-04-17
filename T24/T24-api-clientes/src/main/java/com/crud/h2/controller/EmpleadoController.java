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
import com.crud.h2.dto.Empleado;
import com.crud.h2.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceImpl clienteServideImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listar(){
		return clienteServideImpl.listar();
	}
	
	@PostMapping("/empleados")
	public Empleado salvar(@RequestBody Empleado cliente) {
		
		return clienteServideImpl.guardar(cliente);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado buscar(@PathVariable(name="id") Long id) {
		
		Empleado cliente_xid= new Empleado();
		
		cliente_xid=clienteServideImpl.buscar(id);
		
		System.out.println("Cliente XID: "+cliente_xid);
		
		return cliente_xid;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizar(@PathVariable(name="id")Long id,@RequestBody Empleado cliente) {
		
		Empleado empleado_seleccionado= new Empleado();
		Empleado empleado_actualizado= new Empleado();
		
		empleado_seleccionado= clienteServideImpl.buscar(id);
		
		empleado_seleccionado.setNombre(cliente.getNombre());
		empleado_seleccionado.setCategoria(cliente.getCategoria());
		
		empleado_actualizado = clienteServideImpl.actualizar(empleado_seleccionado);
		
		System.out.println("El cliente actualizado es: "+ empleado_actualizado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		clienteServideImpl.eliminar(id);
	}
	
	
}
