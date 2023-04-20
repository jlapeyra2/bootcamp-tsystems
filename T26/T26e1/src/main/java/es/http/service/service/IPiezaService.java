package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Pieza;

public interface IPiezaService {

	//Metodos del CRUD
	public List<Pieza> listar(); //Listar All 
	
	public Pieza guardar(Pieza x);  //Guarda uno. CREATE
	
	public Pieza buscar(Long id); //Leer datos. READ
	
	public Pieza actualizar(Pieza x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
