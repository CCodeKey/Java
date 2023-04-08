package com.loja.Mercado.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.Mercado.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
