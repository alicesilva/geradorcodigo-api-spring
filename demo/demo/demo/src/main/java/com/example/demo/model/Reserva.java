package com.example.demo.model;
import javax.persistence.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;

@Entity
public class Reserva {
	
	@Id
	private Long id;
	
	private Date data;
	
	private Time hora;
	
	@OneToMany(cascade = {javax.persistence.CascadeType.ALL})
	private List<Recurso> recurso;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getData(){
		return data;
	}
	
	public void setData(Date data){
		this.data = data;
	}

	public Time getHora(){
		return hora;
	}
	
	public void setHora(Time hora){
		this.hora = hora;
	}
	public List<Recurso> getRecurso(){
		return recurso;
	}
	
	public void setRecurso(List<Recurso> recurso){
		this.recurso = recurso;
	}
}
