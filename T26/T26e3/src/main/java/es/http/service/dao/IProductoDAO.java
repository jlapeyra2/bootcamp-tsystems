package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Producto;


public interface IProductoDAO extends JpaRepository<Producto, Long>{

}
