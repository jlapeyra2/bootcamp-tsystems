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
	
	public Articulo guardar(Articulo cliente);	//Guarda un cliente CREATE
	
	public Articulo buscar(Long id); //Leer datos de un cliente READ
	
	public Articulo actualizar(Articulo x); //Actualiza datos del cliente UPDATE
	
	public void eliminar(Long id);// Elimina el cliente DELETE
	
	
}
