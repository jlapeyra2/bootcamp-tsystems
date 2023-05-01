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
import es.http.service.dto.Producto;
import es.http.service.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoServiceImpl productoServideImpl;
	
	@GetMapping("/producto")
	public List<Producto> listar(){
		return productoServideImpl.listar();
	}
	
	@PostMapping("/producto")
	public Producto salvar(@RequestBody Producto producto) {
		return productoServideImpl.guardar(producto);
	}
	
	@GetMapping("/producto/{id}")
	public Producto buscar(@PathVariable(name="id") Long id) {
		return productoServideImpl.buscar(id);
	}
	
	@PutMapping("/producto/{id}")
	public Producto actualizar(@PathVariable(name="id")Long id,@RequestBody Producto producto) {	
		productoServideImpl.buscar(id);
		producto.id = id;
		return productoServideImpl.actualizar(producto);
	}
	
	@DeleteMapping("/producto/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		productoServideImpl.eliminar(id);
	}
	
	
}
