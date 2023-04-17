package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Empleado;

public interface IEmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listar(); //Listar All 
	
	public Empleado guardar(Empleado cliente);	//Guarda un cliente CREATE
	
	public Empleado buscar(Long id); //Leer datos de un cliente READ
	
	public Empleado actualizar(Empleado x); //Actualiza datos del cliente UPDATE
	
	public void eliminar(Long id);// Elimina el cliente DELETE
	
	
}
