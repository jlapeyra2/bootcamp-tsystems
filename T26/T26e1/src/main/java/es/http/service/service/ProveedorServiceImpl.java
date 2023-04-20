package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IProveedorDAO;
import es.http.service.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IProveedorDAO iProveedorDAO;
	
	@Override
	public List<Proveedor> listar() {
		
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor guardar(Proveedor e) {
		
		return iProveedorDAO.save(e);
	}

	@Override
	public Proveedor buscar(Long id) {
		
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizar(Proveedor x) {
		
		return iProveedorDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iProveedorDAO.deleteById(id);
		
	}

}
