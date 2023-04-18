package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Pelicula;

public interface IPeliculaService {

	//Metodos del CRUD
	public List<Pelicula> listar(); //Listar All 
	
	public Pelicula guardar(Pelicula cliente);	//Guarda un cliente CREATE
	
	public Pelicula buscar(Long id); //Leer datos de un cliente READ
	
	public Pelicula actualizar(Pelicula x); //Actualiza datos del cliente UPDATE
	
	public void eliminar(Long id);// Elimina el cliente DELETE
	
	
}
