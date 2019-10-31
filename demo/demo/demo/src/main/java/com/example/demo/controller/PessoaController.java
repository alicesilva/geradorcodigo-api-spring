package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;

@RestController
@RequestMapping("/banco-api")
public class PessoaController {
	

	@Autowired
	PessoaService pessoaService;
	
	
	@PostMapping(value = "/pessoas/{contaid}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
		if(pessoa == null || pessoaService.existsPessoaById(pessoa.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		this.pessoaService.save(pessoa);
			
		return new ResponseEntity<Pessoa>(pessoa, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/pessoas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Pessoa>> getPessoas(){
		List<Pessoa> pessoas = this.pessoaService.getPessoas();
		return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.OK);
	}
	
	@GetMapping(value = "/pessoas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoa> getPessoa(@PathVariable("id") Long id){
		if(id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Pessoa pessoa = pessoaService.getPessoaById(id);
			
		if(pessoa == null) {
			return new ResponseEntity<Pessoa>(pessoa, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/pessoas")
	public ResponseEntity<String> deleteAllPessoa(){
		pessoaService.deleteAllPessoa();
		return new ResponseEntity<String>("Pessoas removidos com sucesso.", HttpStatus.OK);
	}
		
	@DeleteMapping(value = "/pessoas/{id}")
	public ResponseEntity<String> deletePessoa(@PathVariable("id") Long id){
		if(id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Boolean delete = pessoaService.deletePessoa(id);
			
		if(!delete) {
			return new ResponseEntity<String>("Pessoa nao esta cadastrado", HttpStatus.NOT_FOUND);
		}
			
		return new ResponseEntity<String>("Pessoa removido com sucesso.", HttpStatus.OK);
	}

}
