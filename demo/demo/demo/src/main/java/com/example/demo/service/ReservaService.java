package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Reserva;
import com.example.demo.repository.ReservaRepository;

import com.example.demo.model.Recurso;

@Service
public class ReservaService {
	
	@Autowired
	ReservaRepository reservaRepository;
	
	public void save(Reserva reserva) {
		reservaRepository.save(reserva);
	}
	
	public List<Reserva> getReservas(){
		return reservaRepository.findAll();
	}
	
	public Reserva getReservaById(Long id) {
		return reservaRepository.getOne(id);
	}
	
	public void deleteAllReserva() {
		reservaRepository.deleteAll();
	}
	
	public void deleteReserva(Long id) {
		reservaRepository.deleteById(id);
	}
		
	public boolean existsReservaById(Long id) {
		return reservaRepository.existsById(id);
	}
	

	public void update(Long id, Recurso Recurso) {
		Reserva reserva = getReservaById(id);
		reserva.getRecurso().add(Recurso);
		reservaRepository.save(reserva);
	}
}
