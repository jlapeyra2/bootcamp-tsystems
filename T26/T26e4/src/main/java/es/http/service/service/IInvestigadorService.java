package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Investigador;

public interface IInvestigadorService {

	//Metodos del CRUD
	public List<Investigador> listar(); //Listar All 
	
	public Investigador guardar(Investigador x);  //Guarda uno. CREATE
	
	public Investigador buscar(Long id); //Leer datos. READ
	
	public Investigador actualizar(Investigador x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
