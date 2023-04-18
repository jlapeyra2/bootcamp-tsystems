package com.crud.h2.dto;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class Almacen  {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	private String lugar;
	private int capacidad;
	@OneToMany
    @JoinColumn(name="id")
    private List<Caja> cajas;
	
	//Constructores
	
	public Almacen() {
	
	}

	public Almacen(Long id, String lugar, int capacidad) {
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}
	
	//Getters y Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Caja> getCajas() {
		return cajas;
	}
	public void setCajas(List<Caja> cajas) {
		this.cajas = cajas;
	}


	//Metodo impresion de datos por consola
	/*@Override
	public String toString() {
		return "Cliente [id=" + id + ", lugar=" + lugar + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", dni=" + dni + ", fecha=" + fecha + "]";
	}*/
	
	
	
	
	
}
