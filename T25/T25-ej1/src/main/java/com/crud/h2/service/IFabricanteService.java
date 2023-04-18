package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Fabricante;

public interface IFabricanteService {

	//Metodos del CRUD
	public List<Fabricante> listar(); //Listar All 
	
	public Fabricante guardar(Fabricante cliente);	//Guarda un cliente CREATE
	
	public Fabricante buscar(Long id); //Leer datos de un cliente READ
	
	public Fabricante actualizar(Fabricante x); //Actualiza datos del cliente UPDATE
	
	public void eliminar(Long id);// Elimina el cliente DELETE
	
	
}
