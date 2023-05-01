package es.http.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Cientifico;


public interface ICientificoDAO extends JpaRepository<Cientifico, Long>{

}
