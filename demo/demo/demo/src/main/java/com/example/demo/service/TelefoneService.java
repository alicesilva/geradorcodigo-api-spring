package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Telefone;
import com.example.demo.repository.TelefoneRepository;


@Service
public class TelefoneService {
	
	@Autowired
	TelefoneRepository telefoneRepository;
	
	public void save(Telefone telefone) {
		telefoneRepository.save(telefone);
	}
	
	public List<Telefone> getTelefones(){
		return telefoneRepository.findAll();
	}
	
	public Telefone getTelefoneById(Long id) {
		return telefoneRepository.getOne(id);
	}
	
	public void deleteAllTelefone() {
		telefoneRepository.deleteAll();
	}
	
	public void deleteTelefone(Long id) {
		telefoneRepository.deleteById(id);
	}
		
	public boolean existsTelefoneById(Long id) {
		return telefoneRepository.existsById(id);
	}
	

}
