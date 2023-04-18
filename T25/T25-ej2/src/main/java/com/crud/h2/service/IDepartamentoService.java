package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Departamento;

public interface IDepartamentoService {

	//Metodos del CRUD
	public List<Departamento> listar(); //Listar All 
	
	public Departamento guardar(Departamento cliente);	//Guarda un cliente CREATE
	
	public Departamento buscar(Long id); //Leer datos de un cliente READ
	
	public Departamento actualizar(Departamento x); //Actualiza datos del cliente UPDATE
	
	public void eliminar(Long id);// Elimina el cliente DELETE
	
	
}
