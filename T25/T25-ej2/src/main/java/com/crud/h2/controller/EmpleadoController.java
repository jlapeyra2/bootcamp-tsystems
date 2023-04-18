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
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listar(){
		return empleadoServiceImpl.listar();
	}
	
	@PostMapping("/empleados")
	public Empleado salvar(@RequestBody Empleado empleado) {
		
		return empleadoServiceImpl.guardar(empleado);
	}
	
	@GetMapping("/empleados/{dni}")
	public Empleado buscar(@PathVariable(name="dni") String dni) {
		
		return empleadoServiceImpl.buscar(dni);
	}
	
	@PutMapping("/empleados/{dni}")
	public Empleado actualizar(@PathVariable(name="dni")String dni,@RequestBody Empleado empleado) {
		
		
		Empleado empleado_seleccionado= empleadoServiceImpl.buscar(dni);
		
		empleado_seleccionado.setNombre(empleado.getNombre());
		empleado_seleccionado.setApellidos(empleado.getApellidos());
		empleado_seleccionado.setDepartamento(empleado.getDepartamento());
		
		Empleado empleado_actualizado = empleadoServiceImpl.actualizar(empleado_seleccionado);
		
		return empleado_actualizado;
	}
	
	@DeleteMapping("/empleados/{dni}")
	public void eleiminar(@PathVariable(name="dni")String dni) {
		empleadoServiceImpl.eliminar(dni);
	}
	
	
}
