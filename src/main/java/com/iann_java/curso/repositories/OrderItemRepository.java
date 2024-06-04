package com.iann_java.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iann_java.curso.entities.OrderItem;
import com.iann_java.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}

