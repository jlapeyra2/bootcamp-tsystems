package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Caja;

public interface ICajaService {

	//Metodos del CRUD
	public List<Caja> listar(); //Listar All 
	
	public Caja guardar(Caja cliente);	//Guarda un cliente CREATE
	
	public Caja buscar(Long id); //Leer datos de un cliente READ
	
	public Caja actualizar(Caja x); //Actualiza datos del cliente UPDATE
	
	public void eliminar(Long id);// Elimina el cliente DELETE
	
	
}
