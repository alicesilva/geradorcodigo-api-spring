package service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Livro;
import repository.LivroRepository;


@Service
public class LivroService {
	
	@Autowired
	LivroRepository livroRepository;
	
	public void save(Livro livro) {
		livroRepository.save(livro);
	}
	
	public List<Livro> getLivros(){
		return livroRepository.findAll();
	}
	
	public Livro getLivroById(Long id) {
		return livroRepository.getOne(id);
	}
	
	public void deleteAllLivro() {
		livroRepository.deleteAll();
	}
	
	public void deleteLivro(Long id) {
		livroRepository.deleteById(id);
	}
		
	public boolean existsLivroById(Long id) {
		return livroRepository.existsById(id);
	}
	

}
