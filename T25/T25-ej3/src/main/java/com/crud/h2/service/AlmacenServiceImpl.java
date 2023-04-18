package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAlmacenDAO;
import com.crud.h2.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IAlmacenDAO iEmpleadoDAO;
	
	@Override
	public List<Almacen> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Almacen guardar(Almacen e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Almacen buscar(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Almacen actualizar(Almacen x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
