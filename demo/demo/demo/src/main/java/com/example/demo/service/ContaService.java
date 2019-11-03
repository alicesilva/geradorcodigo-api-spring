package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Conta;
import com.example.demo.repository.ContaRepository;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository contaRepository;
	
	public void save(Conta conta) {
		contaRepository.save(conta);
	}
	
	public List<Conta> getContas(){
		return contaRepository.findAll();
	}
	
	public Conta getContaById(Long id) {
		return contaRepository.getOne(id);
	}
	
	public void deleteAllConta() {
		contaRepository.deleteAll();
	}
	
	public void deleteConta(Long id) {
		contaRepository.deleteById(id);
	}
		
	public boolean existsContaById(Long id) {
		return contaRepository.existsById(id);
	}

}
