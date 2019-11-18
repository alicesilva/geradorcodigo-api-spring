package com.example.demo.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.*;
import com.example.demo.service.*;

@RestController
@RequestMapping("/sistemadereservas-api")
public class HomeController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	ReservaService reservaService;
	
	@Autowired
	RecursoService recursoService;
	
	
	@PostMapping(value = "/usuarios", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
		if (usuario == null || usuarioService.existsUsuarioById(usuario.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	
		this.usuarioService.save(usuario);
	
		return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
	}
		
	@GetMapping(value = "/usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Usuario>> getUsuarios() {
		List<Usuario> usuarios = this.usuarioService.getUsuarios();
		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}
	
	@GetMapping(value = "/usuarios/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> getUsuario(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!usuarioService.existsUsuarioById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		Usuario usuario = usuarioService.getUsuarioById(id);
	
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/usuarios")
	public ResponseEntity deleteAllUsuario() {
		usuarioService.deleteAllUsuario();
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/usuarios/{id}")
	public ResponseEntity deleteUsuario(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
			
		if(!usuarioService.existsUsuarioById(id)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
			
		usuarioService.deleteUsuario(id);
	
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	@PutMapping(value = "/usuarios-reserva/{pessoaId}/{reservaId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addReservaToUsuario(@PathVariable("usuarioId") Long usuarioId,
		@PathVariable("reservaId") Long reservaId) {			
		if (!usuarioService.existsUsuarioById(usuarioId)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		if (!reservaService.existsReservaById(reservaId)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
						
		Reserva reserva = reservaService.getReservaById(reservaId);
		usuarioService.update(usuarioId, reserva);
						
		return new ResponseEntity(HttpStatus.OK);
	}
	 
	
	@PostMapping(value = "/reservas", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Reserva> saveReserva(@RequestBody Reserva reserva) {
		if (reserva == null || reservaService.existsReservaById(reserva.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	
		this.reservaService.save(reserva);
	
		return new ResponseEntity<Reserva>(reserva, HttpStatus.CREATED);
	}
		
	@GetMapping(value = "/reservas", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Reserva>> getReservas() {
		List<Reserva> reservas = this.reservaService.getReservas();
		return new ResponseEntity<List<Reserva>>(reservas, HttpStatus.OK);
	}
	
	@GetMapping(value = "/reservas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Reserva> getReserva(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!reservaService.existsReservaById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		Reserva reserva = reservaService.getReservaById(id);
	
		return new ResponseEntity<Reserva>(reserva, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/reservas")
	public ResponseEntity deleteAllReserva() {
		reservaService.deleteAllReserva();
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/reservas/{id}")
	public ResponseEntity deleteReserva(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
			
		if(!reservaService.existsReservaById(id)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
			
		reservaService.deleteReserva(id);
	
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	@PutMapping(value = "/reservas-recurso/{pessoaId}/{recursoId}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity addRecursoToReserva(@PathVariable("reservaId") Long reservaId,
		@PathVariable("recursoId") Long recursoId) {			
		if (!reservaService.existsReservaById(reservaId)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
		if (!recursoService.existsRecursoById(recursoId)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
						
		Recurso recurso = recursoService.getRecursoById(recursoId);
		reservaService.update(reservaId, recurso);
						
		return new ResponseEntity(HttpStatus.OK);
	}
	 
	@PostMapping(value = "/recursos", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Recurso> saveRecurso(@RequestBody Recurso recurso) {
		if (recurso == null || recursoService.existsRecursoById(recurso.getId())) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	
		this.recursoService.save(recurso);
	
		return new ResponseEntity<Recurso>(recurso, HttpStatus.CREATED);
	}
		
	@GetMapping(value = "/recursos", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recurso>> getRecursos() {
		List<Recurso> recursos = this.recursoService.getRecursos();
		return new ResponseEntity<List<Recurso>>(recursos, HttpStatus.OK);
	}
	
	@GetMapping(value = "/recursos/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Recurso> getRecurso(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
			
		if(!recursoService.existsRecursoById(id)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
			
		Recurso recurso = recursoService.getRecursoById(id);
	
		return new ResponseEntity<Recurso>(recurso, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/recursos")
	public ResponseEntity deleteAllRecurso() {
		recursoService.deleteAllRecurso();
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/recursos/{id}")
	public ResponseEntity deleteRecurso(@PathVariable("id") Long id) {
		if (id == null) {
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
			
		if(!recursoService.existsRecursoById(id)) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}
			
		recursoService.deleteRecurso(id);
	
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
	 
	
}
