package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Recurso;
import com.example.demo.repository.RecursoRepository;


@Service
public class RecursoService {
	
	@Autowired
	RecursoRepository recursoRepository;
	
	public void save(Recurso recurso) {
		recursoRepository.save(recurso);
	}
	
	public List<Recurso> getRecursos(){
		return recursoRepository.findAll();
	}
	
	public Recurso getRecursoById(Long id) {
		return recursoRepository.getOne(id);
	}
	
	public void deleteAllRecurso() {
		recursoRepository.deleteAll();
	}
	
	public void deleteRecurso(Long id) {
		recursoRepository.deleteById(id);
	}
		
	public boolean existsRecursoById(Long id) {
		return recursoRepository.existsById(id);
	}
	

}
