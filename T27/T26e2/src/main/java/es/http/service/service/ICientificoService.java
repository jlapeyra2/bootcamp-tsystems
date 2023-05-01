package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Cientifico;

public interface ICientificoService {

	//Metodos del CRUD
	public List<Cientifico> listar(); //Listar All 
	
	public Cientifico guardar(Cientifico x);  //Guarda uno. CREATE
	
	public Cientifico buscar(Long id); //Leer datos. READ
	
	public Cientifico actualizar(Cientifico x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
