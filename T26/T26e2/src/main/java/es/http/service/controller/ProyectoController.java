package es.http.service.controller;

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
import es.http.service.dto.Proyecto;
import es.http.service.service.ProyectoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	
	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyecto")
	public List<Proyecto> listar(){
		return proyectoServiceImpl.listar();
	}
	
	@PostMapping("/proyecto")
	public Proyecto salvar(@RequestBody Proyecto proyecto) {
		return proyectoServiceImpl.guardar(proyecto);
	}
	
	@GetMapping("/proyecto/{id}")
	public Proyecto buscar(@PathVariable(name="id") Long id) {
		return proyectoServiceImpl.buscar(id);
	}
	
	@PutMapping("/proyecto/{id}")
	public Proyecto actualizar(@PathVariable(name="id")Long id,@RequestBody Proyecto proyecto) {
		proyectoServiceImpl.buscar(id);
		proyecto.id = id;
		return proyectoServiceImpl.actualizar(proyecto);
	}
	
	@DeleteMapping("/proyecto/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		proyectoServiceImpl.eliminar(id);
	}
	
	
}
