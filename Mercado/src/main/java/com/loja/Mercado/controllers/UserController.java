package com.loja.Mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loja.Mercado.entities.User;
import com.loja.Mercado.repositorys.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> readDatabase(){
		List<User> lista = repository.findAll();
		return lista;
	}
	
	@GetMapping(value = "/{id}")
	public User buscaPorId(@PathVariable Long id){
		User usuario = repository.findById(id).get();
		return usuario;
	}
	
	@PostMapping
	public User adicionarUser(@RequestBody User usr){
		User newUser= repository.save(usr);
		return newUser;
	}
}
