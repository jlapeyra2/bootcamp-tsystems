package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Proveedor;

public interface IProveedorService {

	//Metodos del CRUD
	public List<Proveedor> listar(); //Listar All 
	
	public Proveedor guardar(Proveedor x);  //Guarda uno. CREATE
	
	public Proveedor buscar(Long id); //Leer datos. READ
	
	public Proveedor actualizar(Proveedor x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
