package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Pieza;


public interface IPiezaDAO extends JpaRepository<Pieza, Long>{

}
