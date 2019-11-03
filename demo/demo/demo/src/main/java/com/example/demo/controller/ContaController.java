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
import com.example.demo.model.Livro;
import com.example.demo.model.Pessoa;
import com.example.demo.model.Telefone;
import com.example.demo.model.Universidade;
import com.example.demo.service.ContaService;
import com.example.demo.service.LivroService;
import com.example.demo.service.PessoaService;
import com.example.demo.service.TelefoneService;
import com.example.demo.service.UniversidadeService;

@RestController
@RequestMapping("/banco-api")
public class ContaController {

	@Autowired
	ContaService contaService;

	@Autowired
	PessoaService pessoaService;

	@Autowired
	LivroService livroService;

	@Autowired
	UniversidadeService universidadeService;

	@Autowired
	TelefoneService telefoneService;

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
	public ResponseEntity<String> deleteAllConta() {
		contaService.deleteAllConta();
		return new ResponseEntity<String>("Contas removidos com sucesso.", HttpStatus.OK);
	}

	@DeleteMapping(value = "/contas/{id}")
	public ResponseEntity<String> deleteConta(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		if(!contaService.existsContaById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		contaService.deleteConta(id);

		return new ResponseEntity<String>("Conta removido com sucesso.", HttpStatus.OK);
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


	@PutMapping(value = "/pessoas-conta/{pessoaId}/{contaId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> associaContaToPessoa(@PathVariable("pessoaId") Long pessoaId,
			@PathVariable("contaId") Long contaId) {
		if (!pessoaService.existsPessoaById(pessoaId)) {
			return new ResponseEntity<>("Nao existe pessoa cadastrada com esse id", HttpStatus.NOT_FOUND);
		}

		if (!contaService.existsContaById(contaId)) {
			return new ResponseEntity<>("Nao existe pessoa cadastrada com esse id", HttpStatus.NOT_FOUND);
		}

		Conta conta = contaService.getContaById(contaId);

		this.pessoaService.update(pessoaId, conta);

		return new ResponseEntity<String>("Ok.", HttpStatus.OK);
	}
	
	@PutMapping(value = "/pessoas-livros/{pessoaId}/{livroId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addLivroToPessoa(@PathVariable("pessoaId") Long pessoaId,
			@PathVariable("livroId") Long livroId) {

		if (!pessoaService.existsPessoaById(pessoaId)) {
			return new ResponseEntity<String>("Nao existe pessoa cadastrado com esse ID", HttpStatus.NOT_FOUND);
		}
		if (!livroService.existsLivroById(livroId)) {
			return new ResponseEntity<String>("Nao existe livro cadastrada com esse ID", HttpStatus.NOT_FOUND);
		}

		Livro livro = livroService.getLivroById(livroId);
		pessoaService.update(pessoaId, livro);

		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}

	@PutMapping(value = "/pessoas-universidades/{pessoaId}/{universidadeId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> asoociaPessoaToUniversidade(@PathVariable("pessoaId") Long pessoaId,
			@PathVariable("universidadeId") Long universidadeId) {

		if (!pessoaService.existsPessoaById(pessoaId)) {
			return new ResponseEntity<String>("Nao existe pessoa cadastrado com esse ID", HttpStatus.NOT_FOUND);
		}
		if (!universidadeService.existsUniversidadeById(universidadeId)) {
			return new ResponseEntity<String>("Nao existe universidade cadastrada com esse ID", HttpStatus.NOT_FOUND);
		}

		Universidade universidade = universidadeService.getUniversidadeById(universidadeId);
		pessoaService.update(pessoaId, universidade);

		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}

	@PutMapping(value = "/pessoas-telefones/{pessoaId}/{telefoneId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addTelefonesToPessoa(@PathVariable("pessoaId") Long pessoaId,
			@PathVariable("telefoneId") Long telefoneId) {

		if (!pessoaService.existsPessoaById(pessoaId)) {
			return new ResponseEntity<String>("Nao existe pessoa cadastrado com esse ID", HttpStatus.NOT_FOUND);
		}
		if (!telefoneService.existsTelefoneById(telefoneId)) {
			return new ResponseEntity<String>("Nao existe telefone cadastrada com esse ID", HttpStatus.NOT_FOUND);
		}

		Telefone telefone = telefoneService.getTelefoneById(telefoneId);
		pessoaService.update(pessoaId, telefone);

		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	
	@PostMapping(value = "/livros", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Livro> saveLivro(@RequestBody Livro livro) {
		if (livro == null || contaService.existsContaById(livro.getId())) {
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

}
