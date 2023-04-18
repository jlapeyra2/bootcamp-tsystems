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
public class Empleado  {
 
	//Atributos de entidad departamento
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dni;
	private String nombre;
	private String apellidos;
	@ManyToOne
    @JoinColumn(name="departamento")
    private Departamento departamento;
	
	//Constructores
	
	public Empleado() {
	
	}

	public Empleado(int dni, String nombre, String apellidos) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	//Getters y Setters
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}
