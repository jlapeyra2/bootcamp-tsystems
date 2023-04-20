package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IArticuloDAO;
import com.crud.h2.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService{
	
	//Utilizamos los metodos de la interface IfabricanteDAO, es como si instaciaramos.
	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public List<Articulo> listar() {
		
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardar(Articulo e) {
		
		return iArticuloDAO.save(e);
	}

	@Override
	public Articulo buscar(Long id) {
		
		return iArticuloDAO.findById(id).get();
	}

	@Override
	public Articulo actualizar(Articulo x) {
		
		return iArticuloDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iArticuloDAO.deleteById(id);
		
	}

}
