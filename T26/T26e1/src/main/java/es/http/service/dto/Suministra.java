package es.http.service.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Suministra  {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	public Long id;
    public Integer precio;
	
	@ManyToOne
    @JoinColumn(name="pieza")
    public Pieza pieza;
	
	@ManyToOne
    @JoinColumn(name="proveedor")
    public Proveedor proveedor;
}
