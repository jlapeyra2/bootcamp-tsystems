package es.http.service.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import es.http.service.dto.Reserva;

public interface IReservaService {

	//Metodos del CRUD
	public List<Reserva> listar(); //Listar All 
	
	public Reserva guardar(Reserva x);  //Guarda uno. CREATE
	
	public Reserva buscar(Long id); //Leer datos. READ
	
	public Reserva actualizar(Reserva x); //Actualiza datos. UPDATE
	
	public void eliminar(Long id);// Elimina. DELETE
	
	
}
