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
public class Caja  {
 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	private String contenido;
	private int valor;
	@ManyToOne
    @JoinColumn(name="almacen")
    private Almacen almacen;
	
	//Constructores
	
	public Caja() {
	
	}

	public Caja(Long id, String contenido, int valor) {
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
	}
	
	//Getters y Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	
	
	
	
	
}
