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
	
	public Fabricante guardar(Fabricante fabricante);	//Guarda un fabricante CREATE
	
	public Fabricante buscar(Long id); //Leer datos de un fabricante READ
	
	public Fabricante actualizar(Fabricante x); //Actualiza datos del fabricante UPDATE
	
	public void eliminar(Long id);// Elimina el fabricante DELETE
	
	
}
