package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Equipo;

public interface IEquipoService {

	//Metodos del CRUD
	public List<Equipo> listar(); //Listar All 
	
	public Equipo guardar(Equipo x);  //Guarda uno. CREATE
	
	public Equipo buscar(Long id); //Leer datos. READ
	
	public Equipo actualizar(Equipo x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
