package com.example.demo.model;
import javax.persistence.*;

import java.sql.*;
import java.sql.Date;
import java.util.*;

@Entity
public class Universidade {
	
	@Id
	private Long id;
	
	private String nome;
	
	private String localizacao;
	
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

	public String getLocalizacao(){
		return localizacao;
	}
	
	public void setLocalizacao(String localizacao){
		this.localizacao = localizacao;
	}
}
