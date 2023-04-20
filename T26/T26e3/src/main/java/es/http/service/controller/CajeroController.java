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
import es.http.service.dto.Cajero;
import es.http.service.service.CajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class CajeroController {
	
	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajero")
	public List<Cajero> listar(){
		return cajeroServiceImpl.listar();
	}
	
	@PostMapping("/cajero")
	public Cajero salvar(@RequestBody Cajero cajero) {
		return cajeroServiceImpl.guardar(cajero);
	}
	
	@GetMapping("/cajero/{id}")
	public Cajero buscar(@PathVariable(name="id") Long id) {
		return cajeroServiceImpl.buscar(id);
	}
	
	@PutMapping("/cajero/{id}")
	public Cajero actualizar(@PathVariable(name="id")Long id,@RequestBody Cajero cajero) {
		cajeroServiceImpl.buscar(id);
		cajero.id = id;
		return cajeroServiceImpl.actualizar(cajero);
	}
	
	@DeleteMapping("/cajero/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		cajeroServiceImpl.eliminar(id);
	}
	
	
}
