package com.iann_java.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iann_java.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
