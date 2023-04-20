package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Articulo;

public interface IArticuloService {

	//Metodos del CRUD
	public List<Articulo> listar(); //Listar All 
	
	public Articulo guardar(Articulo articulo);	//Guarda un articulo CREATE
	
	public Articulo buscar(Long id); //Leer datos de un articulo READ
	
	public Articulo actualizar(Articulo x); //Actualiza datos del articulo UPDATE
	
	public void eliminar(Long id);// Elimina el articulo DELETE
	
	
}
