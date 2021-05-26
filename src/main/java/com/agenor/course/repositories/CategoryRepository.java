package com.agenor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenor.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {

		
}
