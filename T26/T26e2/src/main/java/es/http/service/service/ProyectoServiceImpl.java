package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IProyectoDAO;
import es.http.service.dto.Proyecto;

@Service
public class ProyectoServiceImpl implements IProyectoService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IProyectoDAO iProyectoDAO;
	
	@Override
	public List<Proyecto> listar() {
		
		return iProyectoDAO.findAll();
	}

	@Override
	public Proyecto guardar(Proyecto e) {
		
		return iProyectoDAO.save(e);
	}

	@Override
	public Proyecto buscar(Long id) {
		
		return iProyectoDAO.findById(id).get();
	}

	@Override
	public Proyecto actualizar(Proyecto x) {
		
		return iProyectoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iProyectoDAO.deleteById(id);
		
	}

}
