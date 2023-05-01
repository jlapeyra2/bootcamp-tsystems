package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Asignado;

public interface IAsignadoService {

	//Metodos del CRUD
	public List<Asignado> listar(); //Listar All 
	
	public Asignado guardar(Asignado x);  //Guarda uno. CREATE
	
	public Asignado buscar(Long id); //Leer datos. READ
	
	public Asignado actualizar(Asignado x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
