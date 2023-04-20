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
import es.http.service.dto.Asignado;
import es.http.service.service.AsignadoServiceImpl;

@RestController
@RequestMapping("/api")
public class AsignadoController {
	
	@Autowired
	AsignadoServiceImpl AsignadoServiceImpl;
	
	@GetMapping("/Asignado")
	public List<Asignado> listar(){
		return AsignadoServiceImpl.listar();
	}
	
	@PostMapping("/Asignado")
	public Asignado salvar(@RequestBody Asignado Asignado) {
		return AsignadoServiceImpl.guardar(Asignado);
	}
	
	@GetMapping("/Asignado/{id}")
	public Asignado buscar(@PathVariable(name="id") Long id) {
		return AsignadoServiceImpl.buscar(id);
	}
	
	@PutMapping("/Asignado/{id}")
	public Asignado actualizar(@PathVariable(name="id")Long id,@RequestBody Asignado Asignado) {
		AsignadoServiceImpl.buscar(id);
		Asignado.id = id;
		return AsignadoServiceImpl.actualizar(Asignado);
	}
	
	@DeleteMapping("/Asignado/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		AsignadoServiceImpl.eliminar(id);
	}
	
	
}
