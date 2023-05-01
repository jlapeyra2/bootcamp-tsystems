package es.http.service.dto;


import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Reserva  {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	public Long id;
    public Timestamp comienzo;
    public Timestamp fin;
	
	@ManyToOne
    @JoinColumn(name="investigador")
    public Investigador investigador;
	
	@ManyToOne
    @JoinColumn(name="equipo")
    public Equipo equipo;
	
}
