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
public class Venta  {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
	public Long id;
	
	@ManyToOne
    @JoinColumn(name="cajero")
    public Cajero cajero;
	
	@ManyToOne
    @JoinColumn(name="producto")
    public Producto producto;
	
	@ManyToOne
    @JoinColumn(name="maquina")
    public Maquina maquina;
	
}
