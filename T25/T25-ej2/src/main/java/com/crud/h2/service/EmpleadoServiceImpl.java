package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IEmpleadoDAO;
import com.crud.h2.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado guardar(Empleado e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Empleado buscar(String dni) {
		
		return iEmpleadoDAO.findById(dni).get();
	}

	@Override
	public Empleado actualizar(Empleado x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(String dni) {
		
		iEmpleadoDAO.deleteById(dni);
		
	}

}
