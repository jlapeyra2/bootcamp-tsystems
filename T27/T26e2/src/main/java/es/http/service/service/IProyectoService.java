package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Proyecto;

public interface IProyectoService {

	//Metodos del CRUD
	public List<Proyecto> listar(); //Listar All 
	
	public Proyecto guardar(Proyecto x);  //Guarda uno. CREATE
	
	public Proyecto buscar(Long id); //Leer datos. READ
	
	public Proyecto actualizar(Proyecto x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
