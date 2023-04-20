package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Producto;

public interface IProductoService {

	//Metodos del CRUD
	public List<Producto> listar(); //Listar All 
	
	public Producto guardar(Producto x);  //Guarda uno. CREATE
	
	public Producto buscar(Long id); //Leer datos. READ
	
	public Producto actualizar(Producto x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
