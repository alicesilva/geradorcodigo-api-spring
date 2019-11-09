package com.example.demo.model;

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
	
	@OneToMany(cascade = {javax.persistence.CascadeType.ALL})
	private List<livro> livros;
	
	@ManyToOne(cascade = {javax.persistence.CascadeType.ALL})
	private Universidade universidade;
	
	@ManyToMany(cascade = {javax.persistence.CascadeType.ALL})
	private List<telefone> telefones;
	
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
	public List<livro> getLivros(){
		return livros;
	}
	
	public void setLivros(List<livro> livros){
		this.livros = livros;
	}
	public Universidade getUniversidade(){
		return universidade;
	}
					
	public void setUniversidade(universidade universidade){
		this.universidade = universidade;
	}
	public List<telefone> getTelefones(){
		return telefones;
	}
	
	public void setTelefones(List<telefone> telefones){
		this.telefones = telefones;
	}
}
