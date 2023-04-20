package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Asignado;


public interface IAsignadoDAO extends JpaRepository<Asignado, Long>{

}
