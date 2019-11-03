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
	public boolean existsTelefoneById(Long id) {
		return telefoneRepository.existsById(id);
	}
	
	public Telefone getTelefoneById(Long id) {
		if(existsTelefoneById(id)) {
			return telefoneRepository.getOne(id);
		}else {
			return null;
		}
	}
}
