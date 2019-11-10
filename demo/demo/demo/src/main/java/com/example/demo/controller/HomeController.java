package com.example.demo.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.*;
import com.example.demo.service.*;

@RestController
@RequestMapping("/banco-api")
public class HomeController {
	
	@Autowired
	ContaService contaService;
	
	@Autowired
	PessoaService pessoaService;
	
	@Autowired
	LivroService livroService;
	
	@Autowired
	TelefoneService telefoneService;
	
	@Autowired
	UniversidadeService universidadeService;
	
	
	@PostMapping(value = "/contas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Conta> saveConta(@RequestBody Conta conta) {
		if (conta == null || contaService.existsContaById(conta.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	
		this.contaService.save(conta);
	
		return new ResponseEntity<Conta>(conta, HttpStatus.CREATED);
	}
		
	@GetMapping(value = "/contas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Conta>> getContas() {
		List<Conta> contas = this.contaService.getContas();
		return new ResponseEntity<List<Conta>>(contas, HttpStatus.OK);
	}
	
	@GetMapping(value = "/contas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Conta> getConta(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!contaService.existsContaById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		Conta conta = contaService.getContaById(id);
	
		return new ResponseEntity<Conta>(conta, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/contas")
	public ResponseEntity deleteAllConta() {
		contaService.deleteAllConta();
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/contas/{id}")
	public ResponseEntity deleteConta(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
			
		if(!contaService.existsContaById(id)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
			
		contaService.deleteConta(id);
	
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	@PostMapping(value = "/pessoas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoa> savePessoa(@RequestBody Pessoa pessoa) {
		if (pessoa == null || pessoaService.existsPessoaById(pessoa.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	
		this.pessoaService.save(pessoa);
	
		return new ResponseEntity<Pessoa>(pessoa, HttpStatus.CREATED);
	}
		
	@GetMapping(value = "/pessoas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Pessoa>> getPessoas() {
		List<Pessoa> pessoas = this.pessoaService.getPessoas();
		return new ResponseEntity<List<Pessoa>>(pessoas, HttpStatus.OK);
	}
	
	@GetMapping(value = "/pessoas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pessoa> getPessoa(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!pessoaService.existsPessoaById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		Pessoa pessoa = pessoaService.getPessoaById(id);
	
		return new ResponseEntity<Pessoa>(pessoa, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/pessoas")
	public ResponseEntity<String> deleteAllPessoa() {
		pessoaService.deleteAllPessoa();
		return new ResponseEntity<String>("Pessoas removidos com sucesso.", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/pessoas/{id}")
	public ResponseEntity<String> deletePessoa(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!pessoaService.existsPessoaById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		pessoaService.deletePessoa(id);
	
		return new ResponseEntity<String>("Pessoa removido com sucesso.", HttpStatus.OK);
	}
	
	
	@PutMapping(value = "/pessoas-Conta/{pessoaId}/{contaId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity associaContaToPessoa(@PathVariable("pessoaId") Long pessoaId,
		@PathVariable("contaId") Long contaId) {
		if (!pessoaService.existsPessoaById(pessoaId)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		if (!contaService.existsContaById(contaId)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
						
		Conta conta = contaService.getContaById(contaId);
		this.pessoaService.update(pessoaId, conta);
						
		return new ResponseEntity(HttpStatus.OK);
	}
	@PutMapping(value = "/pessoas-livro/{pessoaId}/{livroId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addLivroToPessoa(@PathVariable("pessoaId") Long pessoaId,
		@PathVariable("livroId") Long livroId) {			
		if (!pessoaService.existsPessoaById(pessoaId)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		if (!livroService.existsLivroById(livroId)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
						
		Livro livro = livroService.getLivroById(livroId);
		pessoaService.update(pessoaId, livro);
						
		return new ResponseEntity(HttpStatus.OK);
	}
	@PutMapping(value = "/pessoas-Universidade/{pessoaId}/{universidadeId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity associaUniversidadeToPessoa(@PathVariable("pessoaId") Long pessoaId,
		@PathVariable("universidadeId") Long universidadeId) {
		if (!pessoaService.existsPessoaById(pessoaId)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		if (!universidadeService.existsUniversidadeById(universidadeId)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
						
		Universidade universidade = universidadeService.getUniversidadeById(universidadeId);
		this.pessoaService.update(pessoaId, universidade);
						
		return new ResponseEntity(HttpStatus.OK);
	}
	@PutMapping(value = "/pessoas-telefone/{pessoaId}/{telefoneId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addTelefoneToPessoa(@PathVariable("pessoaId") Long pessoaId,
		@PathVariable("telefoneId") Long telefoneId) {			
		if (!pessoaService.existsPessoaById(pessoaId)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		if (!telefoneService.existsTelefoneById(telefoneId)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
						
		Telefone telefone = telefoneService.getTelefoneById(telefoneId);
		pessoaService.update(pessoaId, telefone);
						
		return new ResponseEntity(HttpStatus.OK);
	}
	 
	@PostMapping(value = "/livros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Livro> saveLivro(@RequestBody Livro livro) {
		if (livro == null || livroService.existsLivroById(livro.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	
		this.livroService.save(livro);
	
		return new ResponseEntity<Livro>(livro, HttpStatus.CREATED);
	}
		
	@GetMapping(value = "/livros", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Livro>> getLivros() {
		List<Livro> livros = this.livroService.getLivros();
		return new ResponseEntity<List<Livro>>(livros, HttpStatus.OK);
	}
	
	@GetMapping(value = "/livros/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Livro> getLivro(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!livroService.existsLivroById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		Livro livro = livroService.getLivroById(id);
	
		return new ResponseEntity<Livro>(livro, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/livros")
	public ResponseEntity<String> deleteAllLivro() {
		livroService.deleteAllLivro();
		return new ResponseEntity<String>("Livros removidos com sucesso.", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/livros/{id}")
	public ResponseEntity<String> deleteLivro(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!livroService.existsLivroById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		livroService.deleteLivro(id);
	
		return new ResponseEntity<String>("Livro removido com sucesso.", HttpStatus.OK);
	}
	
	
	 
	@PostMapping(value = "/telefones", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Telefone> saveTelefone(@RequestBody Telefone telefone) {
		if (telefone == null || telefoneService.existsTelefoneById(telefone.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	
		this.telefoneService.save(telefone);
	
		return new ResponseEntity<Telefone>(telefone, HttpStatus.CREATED);
	}
		
	@GetMapping(value = "/telefones", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Telefone>> getTelefones() {
		List<Telefone> telefones = this.telefoneService.getTelefones();
		return new ResponseEntity<List<Telefone>>(telefones, HttpStatus.OK);
	}
	
	@GetMapping(value = "/telefones/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Telefone> getTelefone(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!telefoneService.existsTelefoneById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		Telefone telefone = telefoneService.getTelefoneById(id);
	
		return new ResponseEntity<Telefone>(telefone, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/telefones")
	public ResponseEntity<String> deleteAllTelefone() {
		telefoneService.deleteAllTelefone();
		return new ResponseEntity<String>("Telefones removidos com sucesso.", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/telefones/{id}")
	public ResponseEntity<String> deleteTelefone(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!telefoneService.existsTelefoneById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		telefoneService.deleteTelefone(id);
	
		return new ResponseEntity<String>("Telefone removido com sucesso.", HttpStatus.OK);
	}
	
	
	 
	@PostMapping(value = "/universidades", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Universidade> saveUniversidade(@RequestBody Universidade universidade) {
		if (universidade == null || universidadeService.existsUniversidadeById(universidade.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	
		this.universidadeService.save(universidade);
	
		return new ResponseEntity<Universidade>(universidade, HttpStatus.CREATED);
	}
		
	@GetMapping(value = "/universidades", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Universidade>> getUniversidades() {
		List<Universidade> universidades = this.universidadeService.getUniversidades();
		return new ResponseEntity<List<Universidade>>(universidades, HttpStatus.OK);
	}
	
	@GetMapping(value = "/universidades/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Universidade> getUniversidade(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!universidadeService.existsUniversidadeById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		Universidade universidade = universidadeService.getUniversidadeById(id);
	
		return new ResponseEntity<Universidade>(universidade, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/universidades")
	public ResponseEntity<String> deleteAllUniversidade() {
		universidadeService.deleteAllUniversidade();
		return new ResponseEntity<String>("Universidades removidos com sucesso.", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/universidades/{id}")
	public ResponseEntity<String> deleteUniversidade(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!universidadeService.existsUniversidadeById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		universidadeService.deleteUniversidade(id);
	
		return new ResponseEntity<String>("Universidade removido com sucesso.", HttpStatus.OK);
	}
	
	
	 
	
}
