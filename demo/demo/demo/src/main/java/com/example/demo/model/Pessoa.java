package com.example.demo.model;
import javax.persistence.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;

@Entity
public class Pessoa {
	
	@Id
	private Long id;
	
	private String nome;
	
	@OneToOne(cascade = {javax.persistence.CascadeType.ALL})
	private Conta conta;
	
	@OneToMany(cascade = {javax.persistence.CascadeType.ALL})
	private List<Livro> livros;
	
	@ManyToOne(cascade = {javax.persistence.CascadeType.ALL})
	private Universidade universidade;
	
	@ManyToMany(cascade = {javax.persistence.CascadeType.ALL})
	private List<Telefone> telefones;
	
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
	
	public Conta getConta(){
		return conta;
	}
					
	public void setConta(Conta conta){
		this.conta = conta;
	}
	public List<Livro> getLivros(){
		return livros;
	}
	
	public void setLivros(List<Livro> livros){
		this.livros = livros;
	}
	public Universidade getUniversidade(){
		return universidade;
	}
					
	public void setUniversidade(Universidade universidade){
		this.universidade = universidade;
	}
	public List<Telefone> getTelefones(){
		return telefones;
	}
	
	public void setTelefones(List<Telefone> telefones){
		this.telefones = telefones;
	}
}
