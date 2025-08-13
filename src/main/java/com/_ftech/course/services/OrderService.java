package com._ftech.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com._ftech.course.entities.Order;
import com._ftech.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	//ADD DEPENDENCIA DO ORDERRESPOSITORY;
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		
		return obj.get();
	}
	
	
}
