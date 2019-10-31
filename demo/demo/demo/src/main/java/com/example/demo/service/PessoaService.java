package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Conta;
import com.example.demo.model.Pessoa;
import com.example.demo.repository.ContaRepository;
import com.example.demo.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private ContaRepository contaRepository;
	
	public void save(Pessoa pessoa, Long id) {
		Conta conta = contaRepository.getOne(id);
		pessoa.setConta(conta);
		pessoaRepository.save(pessoa);
	}
	
	public List<Pessoa> getPessoas(){
		return pessoaRepository.findAll();
	}
	
	public boolean existsPessoaById(Long id) {
		return pessoaRepository.existsById(id);
	}
	
	public Pessoa getPessoaById(Long id) {
		if(existsPessoaById(id)) {
			return pessoaRepository.getOne(id);
		}else {
			return null;
		}
	}
	
	public void deleteAllPessoa() {
		pessoaRepository.deleteAll();
	}
	
	public Boolean deletePessoa(Long id) {
		if(existsPessoaById(id)) {
			pessoaRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
