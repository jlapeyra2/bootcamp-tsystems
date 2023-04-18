package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IDepartamentoDAO;
import com.crud.h2.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IDepartamentoDAO iEmpleadoDAO;
	
	@Override
	public List<Departamento> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Departamento guardar(Departamento e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Departamento buscar(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Departamento actualizar(Departamento x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
