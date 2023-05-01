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
import es.http.service.dto.Reserva;
import es.http.service.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservaController {
	
	@Autowired
	ReservaServiceImpl ReservaServiceImpl;
	
	@GetMapping("/Reserva")
	public List<Reserva> listar(){
		return ReservaServiceImpl.listar();
	}
	
	@PostMapping("/Reserva")
	public Reserva salvar(@RequestBody Reserva Reserva) {
		return ReservaServiceImpl.guardar(Reserva);
	}
	
	@GetMapping("/Reserva/{id}")
	public Reserva buscar(@PathVariable(name="id") Long id) {
		return ReservaServiceImpl.buscar(id);
	}
	
	@PutMapping("/Reserva/{id}")
	public Reserva actualizar(@PathVariable(name="id")Long id,@RequestBody Reserva Reserva) {
		ReservaServiceImpl.buscar(id);
		Reserva.id = id;
		return ReservaServiceImpl.actualizar(Reserva);
	}
	
	@DeleteMapping("/Reserva/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		ReservaServiceImpl.eliminar(id);
	}
	
	
}
