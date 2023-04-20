package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Suministra;

public interface ISuministraService {

	//Metodos del CRUD
	public List<Suministra> listar(); //Listar All 
	
	public Suministra guardar(Suministra x);  //Guarda uno. CREATE
	
	public Suministra buscar(Long id); //Leer datos. READ
	
	public Suministra actualizar(Suministra x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
