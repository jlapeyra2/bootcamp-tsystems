package com.crud.h2.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Sala  {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	public Long id;
	public String nombre;
	
	@ManyToOne
    @JoinColumn(name="pelicula")
    public Pelicula pelicula;
	
	
	
	
	
}
