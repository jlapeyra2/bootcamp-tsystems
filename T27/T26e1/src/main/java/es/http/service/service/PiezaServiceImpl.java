package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IPiezaDAO;
import es.http.service.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IPiezaDAO iEmpleadoDAO;
	
	@Override
	public List<Pieza> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Pieza guardar(Pieza e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Pieza buscar(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Pieza actualizar(Pieza x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
