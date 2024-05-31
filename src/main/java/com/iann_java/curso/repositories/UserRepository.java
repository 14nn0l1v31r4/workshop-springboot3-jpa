package com.iann_java.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iann_java.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}

