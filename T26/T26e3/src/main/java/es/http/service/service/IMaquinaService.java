package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Maquina;

public interface IMaquinaService {

	//Metodos del CRUD
	public List<Maquina> listar(); //Listar All 
	
	public Maquina guardar(Maquina x);  //Guarda uno. CREATE
	
	public Maquina buscar(Long id); //Leer datos. READ
	
	public Maquina actualizar(Maquina x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
