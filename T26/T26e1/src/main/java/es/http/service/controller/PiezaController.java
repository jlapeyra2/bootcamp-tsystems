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
import es.http.service.dto.Pieza;
import es.http.service.service.PiezaServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezaController {
	
	@Autowired
	PiezaServiceImpl piezaServideImpl;
	
	@GetMapping("/pieza")
	public List<Pieza> listar(){
		return piezaServideImpl.listar();
	}
	
	@PostMapping("/pieza")
	public Pieza salvar(@RequestBody Pieza pieza) {
		return piezaServideImpl.guardar(pieza);
	}
	
	@GetMapping("/pieza/{id}")
	public Pieza buscar(@PathVariable(name="id") Long id) {
		return piezaServideImpl.buscar(id);
	}
	
	@PutMapping("/pieza/{id}")
	public Pieza actualizar(@PathVariable(name="id")Long id,@RequestBody Pieza pieza) {	
		piezaServideImpl.buscar(id);
		pieza.id = id;
		return piezaServideImpl.actualizar(pieza);
	}
	
	@DeleteMapping("/pieza/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		piezaServideImpl.eliminar(id);
	}
	
	
}
