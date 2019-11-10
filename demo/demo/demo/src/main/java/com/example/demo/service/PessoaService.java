package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;

import com.example.demo.model.Conta;
import com.example.demo.model.Livro;
import com.example.demo.model.Universidade;
import com.example.demo.model.Telefone;

@Service
public class PessoaService {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	public void save(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
	public List<Pessoa> getPessoas(){
		return pessoaRepository.findAll();
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
		
	public boolean existsPessoaById(Long id) {
		return pessoaRepository.existsById(id);
	}
	

	public void update(Long id, Conta Conta){
		Pessoa pessoa = getPessoaById(id);
		pessoa.setConta(Conta);
		pessoaRepository.save(pessoa);
	}
	public void update(Long id, Livro Livro) {
		Pessoa pessoa = getPessoaById(id);
		pessoa.getLivros().add(Livro);
		pessoaRepository.save(pessoa);
	}
	public void update(Long id, Universidade Universidade){
		Pessoa pessoa = getPessoaById(id);
		pessoa.setUniversidade(Universidade);
		pessoaRepository.save(pessoa);
	}
	public void update(Long id, Telefone Telefone) {
		Pessoa pessoa = getPessoaById(id);
		pessoa.getTelefones().add(Telefone);
		pessoaRepository.save(pessoa);
	}
}
