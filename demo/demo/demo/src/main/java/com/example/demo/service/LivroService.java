package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Livro;
import com.example.demo.repository.LivroRepository;

@Service
public class LivroService {
	
	@Autowired
	LivroRepository livroRepository;
	
	public void save(Livro livro) {
		livroRepository.save(livro);
	}
	
	public List<Livro> getLivros(){
		return livroRepository.findAll();
	}
	public boolean existsLivroById(Long id) {
		return livroRepository.existsById(id);
	}
	
	
	public Livro getLivroById(Long id) {
		if(existsLivroById(id)) {
			return livroRepository.getOne(id);
		}else {
			return null;
		}
	}
	

}
