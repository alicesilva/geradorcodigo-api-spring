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
		if(existsContaById(id)) {
			return contaRepository.getOne(id);
		}else {
			return null;
		}
	}
	
	public void deleteAllConta() {
		contaRepository.deleteAll();
	}
	
	public Boolean deleteConta(Long id) {
		if(existsContaById(id)) {
			contaRepository.deleteById(id);
			return true;
		}
		return false;
	}
		
	public boolean existsContaById(Long id) {
		return contaRepository.existsById(id);
	}

}
