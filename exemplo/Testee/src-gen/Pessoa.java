package model;
import javax.persistence.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String tipo;
	
	@OneToOne(cascade = {javax.persistence.CascadeType.ALL})
	private Conta conta;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getTipo(){
		return tipo;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public Conta getConta(){
		return conta;
	}
					
	public void setConta(conta conta){
		this.conta = conta;
	}
}