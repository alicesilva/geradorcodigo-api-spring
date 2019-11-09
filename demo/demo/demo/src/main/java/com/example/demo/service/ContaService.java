package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Conta;
import repository.ContaRepository;


@Service
public class ContaService {
	
	@Autowired
	ContaRepository contaRepository;
	
	public void save(Conta conta) {
		contaRepository.save(conta);
	}
	
	public List<Conta> getContas(){
		return contaRepository.findAll();
	}
	
	public Conta getContaById(Long id) {
		return contaRepository.getOne(id);
	}
	
	public void deleteAllConta() {
		contaRepository.deleteAll();
	}
	
	public void deleteConta(Long id) {
		contaRepository.deleteById(id);
	}
		
	public boolean existsContaById(Long id) {
		return contaRepository.existsById(id);
	}
	

}
