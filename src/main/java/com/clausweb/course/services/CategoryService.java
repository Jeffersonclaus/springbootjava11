package com.clausweb.course.services;
import java.util.List;
import java.util.Optional;

import com.clausweb.course.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.clausweb.course.repositories.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired 
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		
	return repository.findAll();	
		
	
	}
	
	public Category FindById(Long id) {
		Optional <Category> obj = repository.findById(id);
		return obj.get(); //retorna get dentro do obj <Category>
		
	}
	
	

}
