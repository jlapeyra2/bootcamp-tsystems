package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IEquipoDAO;
import es.http.service.dto.Equipo;

@Service
public class EquipoServiceImpl implements IEquipoService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IEquipoDAO iEquipoDAO;
	
	@Override
	public List<Equipo> listar() {
		
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo guardar(Equipo e) {
		
		return iEquipoDAO.save(e);
	}

	@Override
	public Equipo buscar(Long id) {
		
		return iEquipoDAO.findById(id).get();
	}

	@Override
	public Equipo actualizar(Equipo x) {
		
		return iEquipoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEquipoDAO.deleteById(id);
		
	}

}
