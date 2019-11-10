package com.example.demo.model;
import javax.persistence.*;

import java.sql.*;
import java.sql.Date;
import java.util.*;

@Entity
public class Livro {
	
	@Id
	private Long id;
	
	private String titulo;
	
	private String resumo;
	
	private Date data;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	public String getResumo(){
		return resumo;
	}
	
	public void setResumo(String resumo){
		this.resumo = resumo;
	}
	public Date getData(){
		return data;
	}
	
	public void setData(Date data){
		this.data = data;
	}
}
