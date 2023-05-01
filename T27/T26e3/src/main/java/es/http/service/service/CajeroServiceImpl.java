package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ICajeroDAO;
import es.http.service.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	ICajeroDAO iCajeroDAO;
	
	@Override
	public List<Cajero> listar() {
		
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero guardar(Cajero e) {
		
		return iCajeroDAO.save(e);
	}

	@Override
	public Cajero buscar(Long id) {
		
		return iCajeroDAO.findById(id).get();
	}

	@Override
	public Cajero actualizar(Cajero x) {
		
		return iCajeroDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iCajeroDAO.deleteById(id);
		
	}

}
