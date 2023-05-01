package es.http.service.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Pieza  {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	public Long id;
	public String nombre;
	
	
}
