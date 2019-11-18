package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;

import com.example.demo.model.Reserva;

@Service
public class UsuarioService {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void save(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public List<Usuario> getUsuarios(){
		return usuarioRepository.findAll();
	}
	
	public Usuario getUsuarioById(Long id) {
		return usuarioRepository.getOne(id);
	}
	
	public void deleteAllUsuario() {
		usuarioRepository.deleteAll();
	}
	
	public void deleteUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
		
	public boolean existsUsuarioById(Long id) {
		return usuarioRepository.existsById(id);
	}
	

	public void update(Long id, Reserva Reserva) {
		Usuario usuario = getUsuarioById(id);
		usuario.getReserva().add(Reserva);
		usuarioRepository.save(usuario);
	}
}
