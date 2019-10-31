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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Conta;
import com.example.demo.service.ContaService;

@RestController
@RequestMapping("/banco-api")
public class ContaController {
	
	@Autowired
	ContaService contaService;
	
	@PostMapping(value = "/contas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Conta> save(@RequestBody Conta conta) {
		if(conta == null || contaService.existsContaById(conta.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		this.contaService.save(conta);
			
		return new ResponseEntity<Conta>(conta, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/contas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Conta>> getContas(){
		List<Conta> contas = this.contaService.getContas();
		return new ResponseEntity<List<Conta>>(contas, HttpStatus.OK);
	}
	
	@GetMapping(value = "/contas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Conta> getConta(@PathVariable("id") Long id){
		if(id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Conta conta = contaService.getContaById(id);
			
		if(conta == null) {
			return new ResponseEntity<Conta>(conta, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Conta>(conta, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/contas")
	public ResponseEntity<String> deleteAllConta(){
		contaService.deleteAllConta();
		return new ResponseEntity<String>("Contas removidos com sucesso.", HttpStatus.OK);
	}
		
	@DeleteMapping(value = "/contas/{id}")
	public ResponseEntity<String> deleteConta(@PathVariable("id") Long id){
		if(id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Boolean delete = contaService.deleteConta(id);
			
		if(!delete) {
			return new ResponseEntity<String>("Conta nao esta cadastrado", HttpStatus.NOT_FOUND);
		}
			
		return new ResponseEntity<String>("Conta removido com sucesso.", HttpStatus.OK);
	}
		
	@PutMapping(value = "/contas/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateConta(@PathVariable("id") Long id, @RequestBody Conta conta){
		if(id == null || conta == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Boolean update = contaService.updateConta(id, conta);
			
		if(!update) {
			return new ResponseEntity<String>("Conta nao esta cadastrado", HttpStatus.NOT_FOUND);
		}
			
		return new ResponseEntity<String>("Conta atualizado com sucesso.", HttpStatus.OK);
	}
	

}
