package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Conta;
import com.example.demo.model.Livro;
import com.example.demo.model.Pessoa;
import com.example.demo.model.Telefone;
import com.example.demo.model.Universidade;
import com.example.demo.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void save(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
	public List<Pessoa> getPessoas(){
		return pessoaRepository.findAll();
	}
	
	public boolean existsPessoaById(Long id) {
		return pessoaRepository.existsById(id);
	}
	
	public Pessoa getPessoaById(Long id) {
		return pessoaRepository.getOne(id);
	}
	
	public void deleteAllPessoa() {
		pessoaRepository.deleteAll();
	}
	
	public void deletePessoa(Long id) {
		pessoaRepository.deleteById(id);
	}
	
	public void update(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
	public void update(Long id, Conta conta) {
		Pessoa pessoa = getPessoaById(id);
		pessoa.setConta(conta);
		pessoaRepository.save(pessoa);
		
	}
	
	public void update(Long id, Livro livro) {
		Pessoa pessoa = getPessoaById(id);
		pessoa.getLivros().add(livro);
		pessoaRepository.save(pessoa);
	}

	public void update(Long id, Universidade universidade) {
		Pessoa pessoa = getPessoaById(id);
		pessoa.setUniversidade(universidade);
		pessoaRepository.save(pessoa);
		
	}
	
	public void update(Long id, Telefone telefone) {
		Pessoa pessoa = getPessoaById(id);
		pessoa.getTelefone().add(telefone);
		pessoaRepository.save(pessoa);
		
	}

}
