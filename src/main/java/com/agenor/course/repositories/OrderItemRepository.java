package com.agenor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenor.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {

		
}
