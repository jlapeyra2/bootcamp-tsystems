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
import es.http.service.dto.Maquina;
import es.http.service.service.MaquinaServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinaController {
	
	@Autowired
	MaquinaServiceImpl maquinaServideImpl;
	
	@GetMapping("/maquina")
	public List<Maquina> listar(){
		return maquinaServideImpl.listar();
	}
	
	@PostMapping("/maquina")
	public Maquina salvar(@RequestBody Maquina maquina) {
		return maquinaServideImpl.guardar(maquina);
	}
	
	@GetMapping("/maquina/{id}")
	public Maquina buscar(@PathVariable(name="id") Long id) {
		return maquinaServideImpl.buscar(id);
	}
	
	@PutMapping("/maquina/{id}")
	public Maquina actualizar(@PathVariable(name="id")Long id,@RequestBody Maquina maquina) {	
		maquinaServideImpl.buscar(id);
		maquina.id = id;
		return maquinaServideImpl.actualizar(maquina);
	}
	
	@DeleteMapping("/maquina/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		maquinaServideImpl.eliminar(id);
	}
	
	
}
