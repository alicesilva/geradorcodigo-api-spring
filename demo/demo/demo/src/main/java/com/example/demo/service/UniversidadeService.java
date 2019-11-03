package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Universidade;
import com.example.demo.repository.UniversidadeRepository;

@Service
public class UniversidadeService {
	
	@Autowired
	UniversidadeRepository universidadeRepository;
	
	public void save(Universidade universidade) {
		universidadeRepository.save(universidade);
	}
	
	public List<Universidade> getUniversidades(){
		return universidadeRepository.findAll();
	}
	public boolean existsUniversidadeById(Long id) {
		return universidadeRepository.existsById(id);
	}
	
	public Universidade getUniversidadeById(Long id) {
		if(existsUniversidadeById(id)) {
			return universidadeRepository.getOne(id);
		}else {
			return null;
		}
	}
}
