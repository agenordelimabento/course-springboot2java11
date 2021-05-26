package com.agenor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenor.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

		
}
