package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICajaDAO;
import com.crud.h2.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	ICajaDAO iCajaDAO;
	
	@Override
	public List<Caja> listar() {
		
		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardar(Caja e) {
		
		return iCajaDAO.save(e);
	}

	@Override
	public Caja buscar(Long id) {
		
		return iCajaDAO.findById(id).get();
	}

	@Override
	public Caja actualizar(Caja x) {
		
		return iCajaDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iCajaDAO.deleteById(id);
		
	}

}
