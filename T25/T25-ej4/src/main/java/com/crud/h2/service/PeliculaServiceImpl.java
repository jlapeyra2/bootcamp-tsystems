package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IPeliculaDAO;
import com.crud.h2.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IPeliculaDAO iEmpleadoDAO;
	
	@Override
	public List<Pelicula> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Pelicula guardar(Pelicula e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Pelicula buscar(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Pelicula actualizar(Pelicula x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
