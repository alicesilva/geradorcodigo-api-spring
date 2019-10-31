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
		if(existsContaById(id)) {
			return contaRepository.getOne(id);
		}else {
			return null;
		}
	}
	
	public void deleteAllConta() {
		contaRepository.deleteAll();
	}
	
	public Boolean deleteConta(Long id) {
		if(existsContaById(id)) {
			contaRepository.deleteById(id);
			return true;
		}
		return false;
	}
		
	public boolean existsContaById(Long id) {
		return contaRepository.existsById(id);
	}
}
