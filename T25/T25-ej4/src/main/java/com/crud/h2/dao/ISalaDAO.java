package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Sala;


public interface ISalaDAO extends JpaRepository<Sala, Long>{

}
