package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Venta;

public interface IVentaService {

	//Metodos del CRUD
	public List<Venta> listar(); //Listar All 
	
	public Venta guardar(Venta x);  //Guarda uno. CREATE
	
	public Venta buscar(Long id); //Leer datos. READ
	
	public Venta actualizar(Venta x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
