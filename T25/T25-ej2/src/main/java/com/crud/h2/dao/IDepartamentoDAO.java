package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Departamento;


public interface IDepartamentoDAO extends JpaRepository<Departamento, Long>{

}
