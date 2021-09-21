package com.clausweb.course.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clausweb.course.entities.Order;
import com.clausweb.course.repositories.OrderRepository;
import com.clausweb.course.services.exceptions.ResourceNotFoundException;


@Service
public class OrderService {
	
	@Autowired 
	private OrderRepository repository;
	
	public List<Order> findAll(){
		
	return repository.findAll();	
		
	
	}
	
	public Order FindById(Long id) {
		Optional <Order> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	

}
