package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IReservaDAO;
import es.http.service.dto.Reserva;

@Service
public class ReservaServiceImpl implements IReservaService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IReservaDAO iReservaDAO;
	
	@Override
	public List<Reserva> listar() {
		
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva guardar(Reserva e) {
		
		return iReservaDAO.save(e);
	}

	@Override
	public Reserva buscar(Long id) {
		
		return iReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizar(Reserva x) {
		
		return iReservaDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iReservaDAO.deleteById(id);
		
	}

}
