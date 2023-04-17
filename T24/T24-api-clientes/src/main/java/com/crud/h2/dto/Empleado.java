package com.crud.h2.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="empleado")//en caso que la tabla sea diferente
public class Empleado  {
 
	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	private String nombre;
	private String categoria;
	private double salario;
	
	//Constructores
	
	public Empleado() {
	
	}

	public Empleado(Long id, String nombre, String categoria, double salario) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.salario = salario;
	}
	
	//Getters y Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
		switch (categoria) {
		case "informático":
			salario = 2000;
			break;
		case "administrador":
			salario = 1800;
			break;
		case "jefe":
			salario = 3000;
			break;
		}
	}

	public double getSalario() {
		return salario;
	}


	//Metodo impresion de datos por consola
	/*@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", dni=" + dni + ", fecha=" + fecha + "]";
	}*/
	
	
	
	
	
}
