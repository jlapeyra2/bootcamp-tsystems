package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ISuministraDAO;
import es.http.service.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	ISuministraDAO iSuministraDAO;
	
	@Override
	public List<Suministra> listar() {
		
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardar(Suministra e) {
		
		return iSuministraDAO.save(e);
	}

	@Override
	public Suministra buscar(Long id) {
		
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizar(Suministra x) {
		
		return iSuministraDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iSuministraDAO.deleteById(id);
		
	}

}
