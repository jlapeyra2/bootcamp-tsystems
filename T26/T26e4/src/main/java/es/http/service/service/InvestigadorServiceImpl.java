package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IInvestigadorDAO;
import es.http.service.dto.Investigador;

@Service
public class InvestigadorServiceImpl implements IInvestigadorService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IInvestigadorDAO iEmpleadoDAO;
	
	@Override
	public List<Investigador> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Investigador guardar(Investigador e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Investigador buscar(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Investigador actualizar(Investigador x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
