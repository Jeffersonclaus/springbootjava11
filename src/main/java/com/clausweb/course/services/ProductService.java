package com.clausweb.course.services;
import java.util.List;
import java.util.Optional;

import com.clausweb.course.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.clausweb.course.repositories.ProductRepository;


@Service
public class ProductService {
	
	@Autowired 
	private ProductRepository repository;
	
	public List<Product> findAll(){
		
	return repository.findAll();	
		
	
	}
	
	public Product FindById(Long id) {
		Optional <Product> obj = repository.findById(id);
		return obj.get(); //retorna get dentro do obj <Product>
		
	}
	
	

}
