package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFabricanteDAO;
import com.crud.h2.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IFabricanteDAO iEmpleadoDAO;
	
	@Override
	public List<Fabricante> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Fabricante guardar(Fabricante e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Fabricante buscar(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Fabricante actualizar(Fabricante x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
