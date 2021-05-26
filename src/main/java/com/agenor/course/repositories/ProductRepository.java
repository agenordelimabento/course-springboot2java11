package com.agenor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenor.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {

		
}
