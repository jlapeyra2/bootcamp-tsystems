package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Cajero;

public interface ICajeroService {

	//Metodos del CRUD
	public List<Cajero> listar(); //Listar All 
	
	public Cajero guardar(Cajero x);  //Guarda uno. CREATE
	
	public Cajero buscar(Long id); //Leer datos. READ
	
	public Cajero actualizar(Cajero x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
