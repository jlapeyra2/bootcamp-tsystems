package com.crud.h2.dto;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Pelicula  {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	public Long id;
	public String nombre;
	public int calificacion_edad;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Sala> salas;	
	
	
}
