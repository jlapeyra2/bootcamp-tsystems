package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IAsignadoDAO;
import es.http.service.dto.Asignado;

@Service
public class AsignadoServiceImpl implements IAsignadoService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IAsignadoDAO iAsignadoDAO;
	
	@Override
	public List<Asignado> listar() {
		
		return iAsignadoDAO.findAll();
	}

	@Override
	public Asignado guardar(Asignado e) {
		
		return iAsignadoDAO.save(e);
	}

	@Override
	public Asignado buscar(Long id) {
		
		return iAsignadoDAO.findById(id).get();
	}

	@Override
	public Asignado actualizar(Asignado x) {
		
		return iAsignadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iAsignadoDAO.deleteById(id);
		
	}

}
