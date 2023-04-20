package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IMaquinaDAO;
import es.http.service.dto.Maquina;

@Service
public class MaquinaServiceImpl implements IMaquinaService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IMaquinaDAO iEmpleadoDAO;
	
	@Override
	public List<Maquina> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Maquina guardar(Maquina e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Maquina buscar(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Maquina actualizar(Maquina x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
