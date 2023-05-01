package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IProductoDAO;
import es.http.service.dto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IProductoDAO iEmpleadoDAO;
	
	@Override
	public List<Producto> listar() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Producto guardar(Producto e) {
		
		return iEmpleadoDAO.save(e);
	}

	@Override
	public Producto buscar(Long id) {
		
		return iEmpleadoDAO.findById(id).get();
	}

	@Override
	public Producto actualizar(Producto x) {
		
		return iEmpleadoDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iEmpleadoDAO.deleteById(id);
		
	}

}
