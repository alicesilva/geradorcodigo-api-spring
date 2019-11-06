package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Pessoa;
import repository.PessoaRepository;

import model.Conta
import model.Livro
import model.Universidade
import model.Telefone

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
	

	public void update(Long id, Conta conta){
		Pessoa pessoa = getPessoaById(id);
		pessoa.setConta(conta);
		pessoaRepository.save(pessoa);
	}
	public void update(Long id, Livro livro) {
		Pessoa pessoa = getPessoaById(id);
		pessoa.getLivros().add(livro);
		pessoaRepository.save(pessoa);
	}
	public void update(Long id, Universidade universidade){
		Pessoa pessoa = getPessoaById(id);
		pessoa.setUniversidade(universidade);
		pessoaRepository.save(pessoa);
	}
	public void update(Long id, Telefone telefone) {
		Pessoa pessoa = getPessoaById(id);
		pessoa.getTelefones().add(telefone);
		pessoaRepository.save(pessoa);
	}
}
