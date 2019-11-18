package com.example.demo.model;
import javax.persistence.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;

@Entity
public class Usuario {
	
	@Id
	private Long id;
	
	private String cpf;
	
	private String nome;
	
	private String endereco;
	
	@OneToMany(cascade = {javax.persistence.CascadeType.ALL})
	private List<Reserva> reserva;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getEndereco(){
		return endereco;
	}
	
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public List<Reserva> getReserva(){
		return reserva;
	}
	
	public void setReserva(List<Reserva> reserva){
		this.reserva = reserva;
	}
}
