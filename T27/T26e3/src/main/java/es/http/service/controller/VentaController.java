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
import es.http.service.dto.Venta;
import es.http.service.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class VentaController {
	
	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/venta")
	public List<Venta> listar(){
		return ventaServiceImpl.listar();
	}
	
	@PostMapping("/venta")
	public Venta salvar(@RequestBody Venta venta) {
		return ventaServiceImpl.guardar(venta);
	}
	
	@GetMapping("/venta/{id}")
	public Venta buscar(@PathVariable(name="id") Long id) {
		return ventaServiceImpl.buscar(id);
	}
	
	@PutMapping("/venta/{id}")
	public Venta actualizar(@PathVariable(name="id")Long id,@RequestBody Venta venta) {
		ventaServiceImpl.buscar(id);
		venta.id = id;
		return ventaServiceImpl.actualizar(venta);
	}
	
	@DeleteMapping("/venta/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		ventaServiceImpl.eliminar(id);
	}
	
	
}
