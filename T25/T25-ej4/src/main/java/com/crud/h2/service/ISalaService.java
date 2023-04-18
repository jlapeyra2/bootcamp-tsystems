package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Sala;

public interface ISalaService {

	//Metodos del CRUD
	public List<Sala> listar(); //Listar All 
	
	public Sala guardar(Sala cliente);	//Guarda un cliente CREATE
	
	public Sala buscar(Long id); //Leer datos de un cliente READ
	
	public Sala actualizar(Sala x); //Actualiza datos del cliente UPDATE
	
	public void eliminar(Long id);// Elimina el cliente DELETE
	
	
}
