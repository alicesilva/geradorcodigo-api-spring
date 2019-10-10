package modelconta;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
	
@RestController
@RequestMapping("/banco-api")
public class ContaController {
		
	@Autowired
	ContaService contaService;
		
	@PostMapping(value = "/contas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Conta> save(@RequestBody Conta conta) {
		if(conta == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		this.contaService.save(conta);
			
		return new ResponseEntity<Conta>(conta, HttpStatus.CREATED);
	}
		
	@GetMapping(value = "contas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Conta>> getContas(){
		List<Conta> contas = this.contaService.getContas();
		return new ResponseEntity<List<Conta>>(contas, HttpStatus.OK);
	}
	
	@GetMapping(value = "contas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
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
	
	@DeleteMapping(value = "conta")
	public ResponseEntity<String> deleteAllConta(){
		contaService.deleteAllConta();
		return new ResponseEntity<String>("Contas removidos com sucesso.", HttpStatus.OK);
	}
		
	@DeleteMapping(value = "contas/{id}")
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
		
	@PutMapping(value = "contas/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateConta(@PathVariable("id") Long id, @RequestBody Conta conta){
		if(id == null || conta == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		Boolean update = contaService.updateConta(id, conta);
			
		if(!update) {
			return new ResponseEntity<String>("Contanao esta cadastrado", HttpStatus.NOT_FOUND);
		}
			
		return new ResponseEntity<String>("Conta atualizado com sucesso.", HttpStatus.OK);
	}
}
