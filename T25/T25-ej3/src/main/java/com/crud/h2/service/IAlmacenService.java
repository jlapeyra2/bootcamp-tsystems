package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Almacen;

public interface IAlmacenService {

	//Metodos del CRUD
	public List<Almacen> listar(); //Listar All 
	
	public Almacen guardar(Almacen cliente);	//Guarda un cliente CREATE
	
	public Almacen buscar(Long id); //Leer datos de un cliente READ
	
	public Almacen actualizar(Almacen x); //Actualiza datos del cliente UPDATE
	
	public void eliminar(Long id);// Elimina el cliente DELETE
	
	
}
