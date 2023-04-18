package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ISalaDAO;
import com.crud.h2.dto.Sala;

@Service
public class SalaServiceImpl implements ISalaService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	ISalaDAO iSalaDAO;
	
	@Override
	public List<Sala> listar() {
		
		return iSalaDAO.findAll();
	}

	@Override
	public Sala guardar(Sala e) {
		
		return iSalaDAO.save(e);
	}

	@Override
	public Sala buscar(Long id) {
		
		return iSalaDAO.findById(id).get();
	}

	@Override
	public Sala actualizar(Sala x) {
		
		return iSalaDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iSalaDAO.deleteById(id);
		
	}

}
