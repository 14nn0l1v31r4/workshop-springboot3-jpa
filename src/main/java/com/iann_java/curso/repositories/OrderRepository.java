package com.iann_java.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iann_java.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}

