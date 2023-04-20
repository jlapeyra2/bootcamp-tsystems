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
import es.http.service.dto.Proveedor;
import es.http.service.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedor")
	public List<Proveedor> listar(){
		return proveedorServiceImpl.listar();
	}
	
	@PostMapping("/proveedor")
	public Proveedor salvar(@RequestBody Proveedor proveedor) {
		return proveedorServiceImpl.guardar(proveedor);
	}
	
	@GetMapping("/proveedor/{id}")
	public Proveedor buscar(@PathVariable(name="id") Long id) {
		return proveedorServiceImpl.buscar(id);
	}
	
	@PutMapping("/proveedor/{id}")
	public Proveedor actualizar(@PathVariable(name="id")Long id,@RequestBody Proveedor proveedor) {
		proveedorServiceImpl.buscar(id);
		proveedor.id = id;
		return proveedorServiceImpl.actualizar(proveedor);
	}
	
	@DeleteMapping("/proveedor/{id}")
	public void eleiminar(@PathVariable(name="id")Long id) {
		proveedorServiceImpl.eliminar(id);
	}
	
	
}
