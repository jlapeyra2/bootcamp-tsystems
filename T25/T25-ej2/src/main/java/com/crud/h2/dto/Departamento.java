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
public class Departamento  {
 
	//Atributos de entidad departamento
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	private String nombre;
	private int presupuesto;
	@OneToMany
    @JoinColumn(name="dni")
    private List<Empleado> empleados;
	
	//Constructores
	
	public Departamento() {
	
	}

	public Departamento(Long id, String nombre, int presupuesto) {
		this.id = id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;
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
	
	
	public int getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleado")
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}


	//Metodo impresion de datos por consola
	/*@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", dni=" + dni + ", fecha=" + fecha + "]";
	}*/
	
	
	
	
	
}
