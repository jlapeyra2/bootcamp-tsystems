package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IFacultadDAO;
import es.http.service.dto.Facultad;

@Service
public class FacultadServiceImpl implements IFacultadService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IFacultadDAO iEmpleadoDAO;
	
	@Override
	public List<Facultad> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Facultad guardar(Facultad e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Facultad buscar(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Facultad actualizar(Facultad x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
