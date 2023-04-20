package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Facultad;

public interface IFacultadService {

	//Metodos del CRUD
	public List<Facultad> listar(); //Listar All 
	
	public Facultad guardar(Facultad x);  //Guarda uno. CREATE
	
	public Facultad buscar(Long id); //Leer datos. READ
	
	public Facultad actualizar(Facultad x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
