package com.iann_java.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iann_java.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
