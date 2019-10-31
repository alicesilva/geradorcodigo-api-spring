package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Pessoa;
import repository.PessoaRepository;

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
		
	public boolean existsPessoaById(Long id) {
		return pessoaRepository.existsById(id);
	}
}
