package es.http.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.http.service.dao.IVentaDAO;
import es.http.service.dto.Venta;

@Service
public class VentaServiceImpl implements IVentaService{
	
	//Utilizamos los metodos de la interface, es como si instaciaramos.
	@Autowired
	IVentaDAO iVentaDAO;
	
	@Override
	public List<Venta> listar() {
		
		return iVentaDAO.findAll();
	}

	@Override
	public Venta guardar(Venta e) {
		
		return iVentaDAO.save(e);
	}

	@Override
	public Venta buscar(Long id) {
		
		return iVentaDAO.findById(id).get();
	}

	@Override
	public Venta actualizar(Venta x) {
		
		return iVentaDAO.save(x);
	}

	@Override
	public void eliminar(Long id) {
		
		iVentaDAO.deleteById(id);
		
	}

}
