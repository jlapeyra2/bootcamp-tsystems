package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.ICientificoDAO;
import es.http.service.dto.Cientifico;

@Service
public class CientificoServiceImpl implements ICientificoService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	ICientificoDAO iEmpleadoDAO;
	
	@Override
	public List<Cientifico> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Cientifico guardar(Cientifico e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Cientifico buscar(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Cientifico actualizar(Cientifico x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
