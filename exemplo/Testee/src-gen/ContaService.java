package modelconta;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		
	private boolean existsContaById(Long id) {
		return contaRepository.existsById(id);
	}
	
	public Boolean updateConta(Long id, Conta contaUpdate) {
		if(existsContaById(id)) {
			Conta conta = getContaById(id);
			conta.setNumero(contaUpdate.getNumero());
			conta.setTipoConta(contaUpdate.getTipoConta());
			contaRepository.save(conta);
			return true;
		}
		return false;
	}
}
